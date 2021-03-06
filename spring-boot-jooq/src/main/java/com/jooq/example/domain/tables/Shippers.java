/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.ShippersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class Shippers extends TableImpl<ShippersRecord> {

    private static final long serialVersionUID = 1554761391;

    /**
     * The reference instance of <code>northwind.shippers</code>
     */
    public static final Shippers SHIPPERS = new Shippers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippersRecord> getRecordType() {
        return ShippersRecord.class;
    }

    /**
     * The column <code>northwind.shippers.id</code>.
     */
    public final TableField<ShippersRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>northwind.shippers.company</code>.
     */
    public final TableField<ShippersRecord, String> COMPANY = createField(DSL.name("company"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.last_name</code>.
     */
    public final TableField<ShippersRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.first_name</code>.
     */
    public final TableField<ShippersRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.email_address</code>.
     */
    public final TableField<ShippersRecord, String> EMAIL_ADDRESS = createField(DSL.name("email_address"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.job_title</code>.
     */
    public final TableField<ShippersRecord, String> JOB_TITLE = createField(DSL.name("job_title"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.business_phone</code>.
     */
    public final TableField<ShippersRecord, String> BUSINESS_PHONE = createField(DSL.name("business_phone"), org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>northwind.shippers.home_phone</code>.
     */
    public final TableField<ShippersRecord, String> HOME_PHONE = createField(DSL.name("home_phone"), org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>northwind.shippers.mobile_phone</code>.
     */
    public final TableField<ShippersRecord, String> MOBILE_PHONE = createField(DSL.name("mobile_phone"), org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>northwind.shippers.fax_number</code>.
     */
    public final TableField<ShippersRecord, String> FAX_NUMBER = createField(DSL.name("fax_number"), org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>northwind.shippers.address</code>.
     */
    public final TableField<ShippersRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>northwind.shippers.city</code>.
     */
    public final TableField<ShippersRecord, String> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.state_province</code>.
     */
    public final TableField<ShippersRecord, String> STATE_PROVINCE = createField(DSL.name("state_province"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.zip_postal_code</code>.
     */
    public final TableField<ShippersRecord, String> ZIP_POSTAL_CODE = createField(DSL.name("zip_postal_code"), org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>northwind.shippers.country_region</code>.
     */
    public final TableField<ShippersRecord, String> COUNTRY_REGION = createField(DSL.name("country_region"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>northwind.shippers.web_page</code>.
     */
    public final TableField<ShippersRecord, String> WEB_PAGE = createField(DSL.name("web_page"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>northwind.shippers.notes</code>.
     */
    public final TableField<ShippersRecord, String> NOTES = createField(DSL.name("notes"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>northwind.shippers.attachments</code>.
     */
    public final TableField<ShippersRecord, byte[]> ATTACHMENTS = createField(DSL.name("attachments"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>northwind.shippers</code> table reference
     */
    public Shippers() {
        this(DSL.name("shippers"), null);
    }

    /**
     * Create an aliased <code>northwind.shippers</code> table reference
     */
    public Shippers(String alias) {
        this(DSL.name(alias), SHIPPERS);
    }

    /**
     * Create an aliased <code>northwind.shippers</code> table reference
     */
    public Shippers(Name alias) {
        this(alias, SHIPPERS);
    }

    private Shippers(Name alias, Table<ShippersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Shippers(Name alias, Table<ShippersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Shippers(Table<O> child, ForeignKey<O, ShippersRecord> key) {
        super(child, key, SHIPPERS);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SHIPPERS_CITY, Indexes.SHIPPERS_COMPANY, Indexes.SHIPPERS_FIRST_NAME, Indexes.SHIPPERS_LAST_NAME, Indexes.SHIPPERS_PRIMARY, Indexes.SHIPPERS_STATE_PROVINCE, Indexes.SHIPPERS_ZIP_POSTAL_CODE);
    }

    @Override
    public Identity<ShippersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHIPPERS;
    }

    @Override
    public UniqueKey<ShippersRecord> getPrimaryKey() {
        return Keys.KEY_SHIPPERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ShippersRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippersRecord>>asList(Keys.KEY_SHIPPERS_PRIMARY);
    }

    @Override
    public Shippers as(String alias) {
        return new Shippers(DSL.name(alias), this);
    }

    @Override
    public Shippers as(Name alias) {
        return new Shippers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Shippers rename(String name) {
        return new Shippers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Shippers rename(Name name) {
        return new Shippers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, byte[]> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
