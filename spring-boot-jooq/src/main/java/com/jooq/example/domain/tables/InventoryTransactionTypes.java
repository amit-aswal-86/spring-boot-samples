/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.InventoryTransactionTypesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class InventoryTransactionTypes extends TableImpl<InventoryTransactionTypesRecord> {

    private static final long serialVersionUID = -576838189;

    /**
     * The reference instance of <code>northwind.inventory_transaction_types</code>
     */
    public static final InventoryTransactionTypes INVENTORY_TRANSACTION_TYPES = new InventoryTransactionTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryTransactionTypesRecord> getRecordType() {
        return InventoryTransactionTypesRecord.class;
    }

    /**
     * The column <code>northwind.inventory_transaction_types.id</code>.
     */
    public final TableField<InventoryTransactionTypesRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>northwind.inventory_transaction_types.type_name</code>.
     */
    public final TableField<InventoryTransactionTypesRecord, String> TYPE_NAME = createField(DSL.name("type_name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>northwind.inventory_transaction_types</code> table reference
     */
    public InventoryTransactionTypes() {
        this(DSL.name("inventory_transaction_types"), null);
    }

    /**
     * Create an aliased <code>northwind.inventory_transaction_types</code> table reference
     */
    public InventoryTransactionTypes(String alias) {
        this(DSL.name(alias), INVENTORY_TRANSACTION_TYPES);
    }

    /**
     * Create an aliased <code>northwind.inventory_transaction_types</code> table reference
     */
    public InventoryTransactionTypes(Name alias) {
        this(alias, INVENTORY_TRANSACTION_TYPES);
    }

    private InventoryTransactionTypes(Name alias, Table<InventoryTransactionTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InventoryTransactionTypes(Name alias, Table<InventoryTransactionTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InventoryTransactionTypes(Table<O> child, ForeignKey<O, InventoryTransactionTypesRecord> key) {
        super(child, key, INVENTORY_TRANSACTION_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INVENTORY_TRANSACTION_TYPES_PRIMARY);
    }

    @Override
    public UniqueKey<InventoryTransactionTypesRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_TRANSACTION_TYPES_PRIMARY;
    }

    @Override
    public List<UniqueKey<InventoryTransactionTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryTransactionTypesRecord>>asList(Keys.KEY_INVENTORY_TRANSACTION_TYPES_PRIMARY);
    }

    @Override
    public InventoryTransactionTypes as(String alias) {
        return new InventoryTransactionTypes(DSL.name(alias), this);
    }

    @Override
    public InventoryTransactionTypes as(Name alias) {
        return new InventoryTransactionTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryTransactionTypes rename(String name) {
        return new InventoryTransactionTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryTransactionTypes rename(Name name) {
        return new InventoryTransactionTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Byte, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}