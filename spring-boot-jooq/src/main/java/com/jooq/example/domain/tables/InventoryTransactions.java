/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.InventoryTransactionsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class InventoryTransactions extends TableImpl<InventoryTransactionsRecord> {

    private static final long serialVersionUID = -1031325965;

    /**
     * The reference instance of <code>northwind.inventory_transactions</code>
     */
    public static final InventoryTransactions INVENTORY_TRANSACTIONS = new InventoryTransactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryTransactionsRecord> getRecordType() {
        return InventoryTransactionsRecord.class;
    }

    /**
     * The column <code>northwind.inventory_transactions.id</code>.
     */
    public final TableField<InventoryTransactionsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>northwind.inventory_transactions.transaction_type</code>.
     */
    public final TableField<InventoryTransactionsRecord, Byte> TRANSACTION_TYPE = createField(DSL.name("transaction_type"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>northwind.inventory_transactions.transaction_created_date</code>.
     */
    public final TableField<InventoryTransactionsRecord, Timestamp> TRANSACTION_CREATED_DATE = createField(DSL.name("transaction_created_date"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>northwind.inventory_transactions.transaction_modified_date</code>.
     */
    public final TableField<InventoryTransactionsRecord, Timestamp> TRANSACTION_MODIFIED_DATE = createField(DSL.name("transaction_modified_date"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>northwind.inventory_transactions.product_id</code>.
     */
    public final TableField<InventoryTransactionsRecord, Integer> PRODUCT_ID = createField(DSL.name("product_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>northwind.inventory_transactions.quantity</code>.
     */
    public final TableField<InventoryTransactionsRecord, Integer> QUANTITY = createField(DSL.name("quantity"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>northwind.inventory_transactions.purchase_order_id</code>.
     */
    public final TableField<InventoryTransactionsRecord, Integer> PURCHASE_ORDER_ID = createField(DSL.name("purchase_order_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>northwind.inventory_transactions.customer_order_id</code>.
     */
    public final TableField<InventoryTransactionsRecord, Integer> CUSTOMER_ORDER_ID = createField(DSL.name("customer_order_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>northwind.inventory_transactions.comments</code>.
     */
    public final TableField<InventoryTransactionsRecord, String> COMMENTS = createField(DSL.name("comments"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>northwind.inventory_transactions</code> table reference
     */
    public InventoryTransactions() {
        this(DSL.name("inventory_transactions"), null);
    }

    /**
     * Create an aliased <code>northwind.inventory_transactions</code> table reference
     */
    public InventoryTransactions(String alias) {
        this(DSL.name(alias), INVENTORY_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>northwind.inventory_transactions</code> table reference
     */
    public InventoryTransactions(Name alias) {
        this(alias, INVENTORY_TRANSACTIONS);
    }

    private InventoryTransactions(Name alias, Table<InventoryTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InventoryTransactions(Name alias, Table<InventoryTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InventoryTransactions(Table<O> child, ForeignKey<O, InventoryTransactionsRecord> key) {
        super(child, key, INVENTORY_TRANSACTIONS);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INVENTORY_TRANSACTIONS_CUSTOMER_ORDER_ID, Indexes.INVENTORY_TRANSACTIONS_CUSTOMER_ORDER_ID_2, Indexes.INVENTORY_TRANSACTIONS_PRIMARY, Indexes.INVENTORY_TRANSACTIONS_PRODUCT_ID, Indexes.INVENTORY_TRANSACTIONS_PRODUCT_ID_2, Indexes.INVENTORY_TRANSACTIONS_PURCHASE_ORDER_ID, Indexes.INVENTORY_TRANSACTIONS_PURCHASE_ORDER_ID_2, Indexes.INVENTORY_TRANSACTIONS_TRANSACTION_TYPE);
    }

    @Override
    public Identity<InventoryTransactionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INVENTORY_TRANSACTIONS;
    }

    @Override
    public UniqueKey<InventoryTransactionsRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_TRANSACTIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<InventoryTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryTransactionsRecord>>asList(Keys.KEY_INVENTORY_TRANSACTIONS_PRIMARY);
    }

    @Override
    public List<ForeignKey<InventoryTransactionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InventoryTransactionsRecord, ?>>asList(Keys.FK_INVENTORY_TRANSACTIONS_INVENTORY_TRANSACTION_TYPES1, Keys.FK_INVENTORY_TRANSACTIONS_PRODUCTS1, Keys.FK_INVENTORY_TRANSACTIONS_PURCHASE_ORDERS1, Keys.FK_INVENTORY_TRANSACTIONS_ORDERS1);
    }

    public InventoryTransactionTypes inventoryTransactionTypes() {
        return new InventoryTransactionTypes(this, Keys.FK_INVENTORY_TRANSACTIONS_INVENTORY_TRANSACTION_TYPES1);
    }

    public Products products() {
        return new Products(this, Keys.FK_INVENTORY_TRANSACTIONS_PRODUCTS1);
    }

    public PurchaseOrders purchaseOrders() {
        return new PurchaseOrders(this, Keys.FK_INVENTORY_TRANSACTIONS_PURCHASE_ORDERS1);
    }

    public Orders orders() {
        return new Orders(this, Keys.FK_INVENTORY_TRANSACTIONS_ORDERS1);
    }

    @Override
    public InventoryTransactions as(String alias) {
        return new InventoryTransactions(DSL.name(alias), this);
    }

    @Override
    public InventoryTransactions as(Name alias) {
        return new InventoryTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryTransactions rename(String name) {
        return new InventoryTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryTransactions rename(Name name) {
        return new InventoryTransactions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Byte, Timestamp, Timestamp, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}