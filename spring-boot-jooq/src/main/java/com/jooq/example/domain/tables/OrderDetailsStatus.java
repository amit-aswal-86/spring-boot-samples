/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables;


import com.jooq.example.domain.Indexes;
import com.jooq.example.domain.Keys;
import com.jooq.example.domain.Northwind;
import com.jooq.example.domain.tables.records.OrderDetailsStatusRecord;

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
public class OrderDetailsStatus extends TableImpl<OrderDetailsStatusRecord> {

    private static final long serialVersionUID = 1300452359;

    /**
     * The reference instance of <code>northwind.order_details_status</code>
     */
    public static final OrderDetailsStatus ORDER_DETAILS_STATUS = new OrderDetailsStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderDetailsStatusRecord> getRecordType() {
        return OrderDetailsStatusRecord.class;
    }

    /**
     * The column <code>northwind.order_details_status.id</code>.
     */
    public final TableField<OrderDetailsStatusRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>northwind.order_details_status.status_name</code>.
     */
    public final TableField<OrderDetailsStatusRecord, String> STATUS_NAME = createField(DSL.name("status_name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>northwind.order_details_status</code> table reference
     */
    public OrderDetailsStatus() {
        this(DSL.name("order_details_status"), null);
    }

    /**
     * Create an aliased <code>northwind.order_details_status</code> table reference
     */
    public OrderDetailsStatus(String alias) {
        this(DSL.name(alias), ORDER_DETAILS_STATUS);
    }

    /**
     * Create an aliased <code>northwind.order_details_status</code> table reference
     */
    public OrderDetailsStatus(Name alias) {
        this(alias, ORDER_DETAILS_STATUS);
    }

    private OrderDetailsStatus(Name alias, Table<OrderDetailsStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderDetailsStatus(Name alias, Table<OrderDetailsStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderDetailsStatus(Table<O> child, ForeignKey<O, OrderDetailsStatusRecord> key) {
        super(child, key, ORDER_DETAILS_STATUS);
    }

    @Override
    public Schema getSchema() {
        return Northwind.NORTHWIND;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDER_DETAILS_STATUS_PRIMARY);
    }

    @Override
    public UniqueKey<OrderDetailsStatusRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_DETAILS_STATUS_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderDetailsStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderDetailsStatusRecord>>asList(Keys.KEY_ORDER_DETAILS_STATUS_PRIMARY);
    }

    @Override
    public OrderDetailsStatus as(String alias) {
        return new OrderDetailsStatus(DSL.name(alias), this);
    }

    @Override
    public OrderDetailsStatus as(Name alias) {
        return new OrderDetailsStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetailsStatus rename(String name) {
        return new OrderDetailsStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetailsStatus rename(Name name) {
        return new OrderDetailsStatus(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
