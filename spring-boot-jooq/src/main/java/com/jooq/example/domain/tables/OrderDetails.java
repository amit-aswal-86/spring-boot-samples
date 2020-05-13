/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.OrderDetailsRecord;

import java.math.BigDecimal;
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
import org.jooq.Row10;
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
public class OrderDetails extends TableImpl<OrderDetailsRecord> {

    private static final long serialVersionUID = 1706437153;

    /**
     * The reference instance of <code>northwind.order_details</code>
     */
    public static final OrderDetails ORDER_DETAILS = new OrderDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderDetailsRecord> getRecordType() {
        return OrderDetailsRecord.class;
    }

    /**
     * The column <code>northwind.order_details.id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>northwind.order_details.order_id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>northwind.order_details.product_id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> PRODUCT_ID = createField(DSL.name("product_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>northwind.order_details.quantity</code>.
     */
    public final TableField<OrderDetailsRecord, BigDecimal> QUANTITY = createField(DSL.name("quantity"), org.jooq.impl.SQLDataType.DECIMAL(18, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>northwind.order_details.unit_price</code>.
     */
    public final TableField<OrderDetailsRecord, BigDecimal> UNIT_PRICE = createField(DSL.name("unit_price"), org.jooq.impl.SQLDataType.DECIMAL(19, 4).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>northwind.order_details.discount</code>.
     */
    public final TableField<OrderDetailsRecord, Double> DISCOUNT = createField(DSL.name("discount"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>northwind.order_details.status_id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> STATUS_ID = createField(DSL.name("status_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>northwind.order_details.date_allocated</code>.
     */
    public final TableField<OrderDetailsRecord, Timestamp> DATE_ALLOCATED = createField(DSL.name("date_allocated"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>northwind.order_details.purchase_order_id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> PURCHASE_ORDER_ID = createField(DSL.name("purchase_order_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>northwind.order_details.inventory_id</code>.
     */
    public final TableField<OrderDetailsRecord, Integer> INVENTORY_ID = createField(DSL.name("inventory_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>northwind.order_details</code> table reference
     */
    public OrderDetails() {
        this(DSL.name("order_details"), null);
    }

    /**
     * Create an aliased <code>northwind.order_details</code> table reference
     */
    public OrderDetails(String alias) {
        this(DSL.name(alias), ORDER_DETAILS);
    }

    /**
     * Create an aliased <code>northwind.order_details</code> table reference
     */
    public OrderDetails(Name alias) {
        this(alias, ORDER_DETAILS);
    }

    private OrderDetails(Name alias, Table<OrderDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderDetails(Name alias, Table<OrderDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderDetails(Table<O> child, ForeignKey<O, OrderDetailsRecord> key) {
        super(child, key, ORDER_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDER_DETAILS_FK_ORDER_DETAILS_ORDERS1_IDX, Indexes.ORDER_DETAILS_FK_ORDER_DETAILS_ORDER_DETAILS_STATUS1_IDX, Indexes.ORDER_DETAILS_ID, Indexes.ORDER_DETAILS_ID_2, Indexes.ORDER_DETAILS_ID_3, Indexes.ORDER_DETAILS_ID_4, Indexes.ORDER_DETAILS_ID_5, Indexes.ORDER_DETAILS_INVENTORY_ID, Indexes.ORDER_DETAILS_PRIMARY, Indexes.ORDER_DETAILS_PRODUCT_ID, Indexes.ORDER_DETAILS_PRODUCT_ID_2, Indexes.ORDER_DETAILS_PURCHASE_ORDER_ID);
    }

    @Override
    public Identity<OrderDetailsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_DETAILS;
    }

    @Override
    public UniqueKey<OrderDetailsRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderDetailsRecord>>asList(Keys.KEY_ORDER_DETAILS_PRIMARY);
    }

    @Override
    public List<ForeignKey<OrderDetailsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderDetailsRecord, ?>>asList(Keys.FK_ORDER_DETAILS_ORDERS1, Keys.FK_ORDER_DETAILS_PRODUCTS1, Keys.FK_ORDER_DETAILS_ORDER_DETAILS_STATUS1);
    }

    public Orders orders() {
        return new Orders(this, Keys.FK_ORDER_DETAILS_ORDERS1);
    }

    public Products products() {
        return new Products(this, Keys.FK_ORDER_DETAILS_PRODUCTS1);
    }

    public OrderDetailsStatus orderDetailsStatus() {
        return new OrderDetailsStatus(this, Keys.FK_ORDER_DETAILS_ORDER_DETAILS_STATUS1);
    }

    @Override
    public OrderDetails as(String alias) {
        return new OrderDetails(DSL.name(alias), this);
    }

    @Override
    public OrderDetails as(Name alias) {
        return new OrderDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetails rename(String name) {
        return new OrderDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetails rename(Name name) {
        return new OrderDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, Integer, BigDecimal, BigDecimal, Double, Integer, Timestamp, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}