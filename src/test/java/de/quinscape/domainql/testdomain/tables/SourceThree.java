/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables;


import de.quinscape.domainql.testdomain.Indexes;
import de.quinscape.domainql.testdomain.Keys;
import de.quinscape.domainql.testdomain.Public;
import de.quinscape.domainql.testdomain.tables.records.SourceThreeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SourceThree extends TableImpl<SourceThreeRecord> {

    private static final long serialVersionUID = 1064107514;

    /**
     * The reference instance of <code>public.source_three</code>
     */
    public static final SourceThree SOURCE_THREE = new SourceThree();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SourceThreeRecord> getRecordType() {
        return SourceThreeRecord.class;
    }

    /**
     * The column <code>public.source_three.id</code>.
     */
    public final TableField<SourceThreeRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.source_three.target_id</code>.
     */
    public final TableField<SourceThreeRecord, String> TARGET_ID = createField("target_id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>public.source_three</code> table reference
     */
    public SourceThree() {
        this(DSL.name("source_three"), null);
    }

    /**
     * Create an aliased <code>public.source_three</code> table reference
     */
    public SourceThree(String alias) {
        this(DSL.name(alias), SOURCE_THREE);
    }

    /**
     * Create an aliased <code>public.source_three</code> table reference
     */
    public SourceThree(Name alias) {
        this(alias, SOURCE_THREE);
    }

    private SourceThree(Name alias, Table<SourceThreeRecord> aliased) {
        this(alias, aliased, null);
    }

    private SourceThree(Name alias, Table<SourceThreeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PK_SOURCE_THREE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SourceThreeRecord> getPrimaryKey() {
        return Keys.PK_SOURCE_THREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SourceThreeRecord>> getKeys() {
        return Arrays.<UniqueKey<SourceThreeRecord>>asList(Keys.PK_SOURCE_THREE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SourceThreeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SourceThreeRecord, ?>>asList(Keys.SOURCE_THREE__FK_SOURCE_THREE_TARGET_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceThree as(String alias) {
        return new SourceThree(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceThree as(Name alias) {
        return new SourceThree(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SourceThree rename(String name) {
        return new SourceThree(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SourceThree rename(Name name) {
        return new SourceThree(name, null);
    }
}
