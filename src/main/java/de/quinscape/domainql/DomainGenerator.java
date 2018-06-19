package de.quinscape.domainql;

import de.quinscape.domainql.model.Domain;
import de.quinscape.domainql.model.DomainField;
import de.quinscape.domainql.model.DomainType;
import de.quinscape.domainql.model.FieldType;
import de.quinscape.domainql.model.ForeignKey;
import de.quinscape.spring.jsview.util.JSONUtil;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.tools.StringUtils;
import org.svenson.info.JSONClassInfo;
import org.svenson.info.JSONPropertyInfo;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Generates a domainql model from generated JOOQ code.
 */
public final class DomainGenerator
{
    private DomainGenerator()
    {

    }

    public static Domain createDomain(Schema schema, Domain previousDomain)
    {
        return createDomain(schema.getTables(), previousDomain);
    }


    public static Domain createDomain(List<Table<?>> tables, Domain previousDomain)
    {
        final Domain.Builder builder = Domain.newDomain();

        for (Table<?> table : tables)
        {

            final Class<?> pojoType = DomainQL.findPojoTypeOf(table);

            final DomainType.Builder typeBuilder = DomainType.newType();

            final String typeName = StringUtils.toCamelCase(table.getName());

            final DomainType previousType = previousDomain != null ? previousDomain.getDomainType(typeName) : null;

            typeBuilder
                .withName(typeName)
                .withDescription(previousType != null ? previousType.getDescription() : "Autogenerated for " + pojoType.getName())
                .withFields(getFieldsOf(table, pojoType, previousType))
                .withForeignKeys(foreignKeysOf(table, pojoType))
                .withPrimaryKey(primaryKeyFields(table));

            for (UniqueKey<?> uniqueKey : table.getKeys())
            {
                if (!uniqueKey.equals(table.getPrimaryKey()))
                {
                    typeBuilder.withUniqueConstraint(fieldNames(uniqueKey.getFields()));
                }
            }

            builder.withTypes(typeBuilder.build());
        }



        return builder.build();
    }


    private static List<DomainField> getFieldsOf(
        Table<?> table,
        Class<?> pojoType,
        DomainType previousType
    )
    {

        List<DomainField> fields = new ArrayList<>();

        DomainFieldComparator domainFieldComparator = new DomainFieldComparator(table.fields());

        final JSONClassInfo classInfo = JSONUtil.getClassInfo(pojoType);
        for (JSONPropertyInfo info : classInfo.getPropertyInfos())
        {

            final Class<Object> type = info.getType();
            final Column jpaColumnAnno = JSONUtil.findAnnotation(info, Column.class);

            final boolean isRequired = JSONUtil.findAnnotation(info, NotNull.class) != null;

            final String name = info.getJsonName();

            DomainField previousField = previousType != null ? previousType.getField(name) : null;

            fields.add(
                DomainField.newField()
                    .withName(name)
                    .withDescription(previousField != null ? previousField.getDescription() : null)
                    .withType(FieldType.getFieldType(type))
                    .withMaxLength(jpaColumnAnno.length())
                    .isRequired(isRequired)
                    .setUnique(hasDedicatedUniqueKey(table, jpaColumnAnno.name()))
                    .build()
            );

            fields.sort(domainFieldComparator);
        }
        return fields;
    }


    private static boolean hasDedicatedUniqueKey(Table<?> table, String fieldName)
    {
        for (UniqueKey<?> uniqueKey : table.getKeys())
        {
            final List<? extends TableField<?, ?>> fields = uniqueKey.getFields();
            if (fields.size() == 1 && fields.get(0).getName().equals(fieldName))
            {
                return true;
            }
        }
        return false;
    }


    private static List<String> primaryKeyFields(Table<?> table)
    {
        final List<? extends TableField<?, ?>> fields = table.getPrimaryKey().getFields();
        return fieldNames(fields);
    }

    private static List<String> fieldNames(List<? extends TableField<?, ?>> fields)
    {
        return fields.stream()
            .map(field -> StringUtils.toCamelCaseLC(field.getName()))
            .collect(Collectors.toList());
    }

    private static List<ForeignKey> foreignKeysOf(Table<?> table, Class<?> pojoType)
    {
        return table.getReferences().stream()
            .map(
                ref ->
                {
                    final UniqueKey<?> key = ref.getKey();
                    return new ForeignKey(
                        null,
                        fieldNames(ref.getFields()),
                        StringUtils.toCamelCase(key.getTable().getName()),
                        fieldNames(key.getFields()),
                        null
                    );
                }
            )
            .collect(Collectors.toList());
    }


    private static class DomainFieldComparator
        implements Comparator<DomainField>
    {
        private final Map<String,Integer> priority;
        public DomainFieldComparator(Field<?>[] fields)
        {
            Map<String,Integer> priority = new HashMap<>();
            for (int i = 0; i < fields.length; i++)
            {
                Field<?> field = fields[i];
                priority.put( StringUtils.toCamelCaseLC(field.getName()), i);
            }

            this.priority = priority;
        }


        @Override
        public int compare(DomainField o1, DomainField o2)
        {
            final Integer priorityA = priority.get(o1.getName());
            if (priorityA == null)
            {
                throw new IllegalStateException("Could not find priority for " + o1.getName());
            }

            final Integer priorityB = priority.get(o2.getName());

            if (priorityB == null)
            {
                throw new IllegalStateException("Could not find priority for " + o2.getName());
            }


            return priorityA - priorityB;
        }
    }
}
