/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.PrivilegesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Privileges extends TableImpl<PrivilegesRecord> {

    private static final long serialVersionUID = -1693764004;

    /**
     * The reference instance of <code>northwind.privileges</code>
     */
    public static final Privileges PRIVILEGES = new Privileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrivilegesRecord> getRecordType() {
        return PrivilegesRecord.class;
    }

    /**
     * The column <code>northwind.privileges.id</code>.
     */
    public final TableField<PrivilegesRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>northwind.privileges.privilege_name</code>.
     */
    public final TableField<PrivilegesRecord, String> PRIVILEGE_NAME = createField(DSL.name("privilege_name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>northwind.privileges</code> table reference
     */
    public Privileges() {
        this(DSL.name("privileges"), null);
    }

    /**
     * Create an aliased <code>northwind.privileges</code> table reference
     */
    public Privileges(String alias) {
        this(DSL.name(alias), PRIVILEGES);
    }

    /**
     * Create an aliased <code>northwind.privileges</code> table reference
     */
    public Privileges(Name alias) {
        this(alias, PRIVILEGES);
    }

    private Privileges(Name alias, Table<PrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Privileges(Name alias, Table<PrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Privileges(Table<O> child, ForeignKey<O, PrivilegesRecord> key) {
        super(child, key, PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIVILEGES_PRIMARY);
    }

    @Override
    public Identity<PrivilegesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRIVILEGES;
    }

    @Override
    public UniqueKey<PrivilegesRecord> getPrimaryKey() {
        return Keys.KEY_PRIVILEGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<PrivilegesRecord>> getKeys() {
        return Arrays.<UniqueKey<PrivilegesRecord>>asList(Keys.KEY_PRIVILEGES_PRIMARY);
    }

    @Override
    public Privileges as(String alias) {
        return new Privileges(DSL.name(alias), this);
    }

    @Override
    public Privileges as(Name alias) {
        return new Privileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Privileges rename(String name) {
        return new Privileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Privileges rename(Name name) {
        return new Privileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
