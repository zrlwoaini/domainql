/*
 * This file is generated by jOOQ.
*/
package de.quinscape.domainql.testdomain.tables;


import de.quinscape.domainql.testdomain.Indexes;
import de.quinscape.domainql.testdomain.Keys;
import de.quinscape.domainql.testdomain.Public;
import de.quinscape.domainql.testdomain.tables.records.FooRecord;

import java.sql.Timestamp;
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
public class Foo extends TableImpl<FooRecord> {

    private static final long serialVersionUID = -965144762;

    /**
     * The reference instance of <code>public.foo</code>
     */
    public static final Foo FOO = new Foo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FooRecord> getRecordType() {
        return FooRecord.class;
    }

    /**
     * The column <code>public.foo.id</code>.
     */
    public final TableField<FooRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.foo.name</code>.
     */
    public final TableField<FooRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.foo.num</code>.
     */
    public final TableField<FooRecord, Integer> NUM = createField("num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.foo.created</code>.
     */
    public final TableField<FooRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.foo</code> table reference
     */
    public Foo() {
        this(DSL.name("foo"), null);
    }

    /**
     * Create an aliased <code>public.foo</code> table reference
     */
    public Foo(String alias) {
        this(DSL.name(alias), FOO);
    }

    /**
     * Create an aliased <code>public.foo</code> table reference
     */
    public Foo(Name alias) {
        this(alias, FOO);
    }

    private Foo(Name alias, Table<FooRecord> aliased) {
        this(alias, aliased, null);
    }

    private Foo(Name alias, Table<FooRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PK_FOO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FooRecord> getPrimaryKey() {
        return Keys.PK_FOO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FooRecord>> getKeys() {
        return Arrays.<UniqueKey<FooRecord>>asList(Keys.PK_FOO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Foo as(String alias) {
        return new Foo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Foo as(Name alias) {
        return new Foo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Foo rename(String name) {
        return new Foo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Foo rename(Name name) {
        return new Foo(name, null);
    }
}
