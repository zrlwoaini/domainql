/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables;


import de.quinscape.domainql.testdomain.Indexes;
import de.quinscape.domainql.testdomain.Keys;
import de.quinscape.domainql.testdomain.Public;
import de.quinscape.domainql.testdomain.tables.records.TargetSevenRecord;

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
public class TargetSeven extends TableImpl<TargetSevenRecord> {

    private static final long serialVersionUID = -882061389;

    /**
     * The reference instance of <code>public.target_seven</code>
     */
    public static final TargetSeven TARGET_SEVEN = new TargetSeven();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TargetSevenRecord> getRecordType() {
        return TargetSevenRecord.class;
    }

    /**
     * The column <code>public.target_seven.id</code>.
     */
    public final TableField<TargetSevenRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.target_seven.name</code>.
     */
    public final TableField<TargetSevenRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>public.target_seven</code> table reference
     */
    public TargetSeven() {
        this(DSL.name("target_seven"), null);
    }

    /**
     * Create an aliased <code>public.target_seven</code> table reference
     */
    public TargetSeven(String alias) {
        this(DSL.name(alias), TARGET_SEVEN);
    }

    /**
     * Create an aliased <code>public.target_seven</code> table reference
     */
    public TargetSeven(Name alias) {
        this(alias, TARGET_SEVEN);
    }

    private TargetSeven(Name alias, Table<TargetSevenRecord> aliased) {
        this(alias, aliased, null);
    }

    private TargetSeven(Name alias, Table<TargetSevenRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PK_TARGET_SEVEN, Indexes.TARGET_SEVEN_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TargetSevenRecord> getPrimaryKey() {
        return Keys.PK_TARGET_SEVEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TargetSevenRecord>> getKeys() {
        return Arrays.<UniqueKey<TargetSevenRecord>>asList(Keys.PK_TARGET_SEVEN, Keys.TARGET_SEVEN_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TargetSeven as(String alias) {
        return new TargetSeven(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TargetSeven as(Name alias) {
        return new TargetSeven(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TargetSeven rename(String name) {
        return new TargetSeven(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TargetSeven rename(Name name) {
        return new TargetSeven(name, null);
    }
}
