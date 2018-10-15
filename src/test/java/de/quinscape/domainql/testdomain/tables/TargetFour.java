/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables;


import de.quinscape.domainql.testdomain.Indexes;
import de.quinscape.domainql.testdomain.Keys;
import de.quinscape.domainql.testdomain.Public;
import de.quinscape.domainql.testdomain.tables.records.TargetFourRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TargetFour extends TableImpl<TargetFourRecord> {

    private static final long serialVersionUID = 1075375903;

    /**
     * The reference instance of <code>public.target_four</code>
     */
    public static final TargetFour TARGET_FOUR = new TargetFour();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TargetFourRecord> getRecordType() {
        return TargetFourRecord.class;
    }

    /**
     * The column <code>public.target_four.id</code>.
     */
    public final TableField<TargetFourRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>public.target_four</code> table reference
     */
    public TargetFour() {
        this(DSL.name("target_four"), null);
    }

    /**
     * Create an aliased <code>public.target_four</code> table reference
     */
    public TargetFour(String alias) {
        this(DSL.name(alias), TARGET_FOUR);
    }

    /**
     * Create an aliased <code>public.target_four</code> table reference
     */
    public TargetFour(Name alias) {
        this(alias, TARGET_FOUR);
    }

    private TargetFour(Name alias, Table<TargetFourRecord> aliased) {
        this(alias, aliased, null);
    }

    private TargetFour(Name alias, Table<TargetFourRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PK_TARGET_FOUR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TargetFourRecord> getPrimaryKey() {
        return Keys.PK_TARGET_FOUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TargetFourRecord>> getKeys() {
        return Arrays.<UniqueKey<TargetFourRecord>>asList(Keys.PK_TARGET_FOUR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TargetFour as(String alias) {
        return new TargetFour(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TargetFour as(Name alias) {
        return new TargetFour(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TargetFour rename(String name) {
        return new TargetFour(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TargetFour rename(Name name) {
        return new TargetFour(name, null);
    }
}
