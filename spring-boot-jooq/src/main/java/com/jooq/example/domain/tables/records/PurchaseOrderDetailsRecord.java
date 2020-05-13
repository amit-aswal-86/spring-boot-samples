/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables.records;


import com.jooq.example.domain.tables.PurchaseOrderDetails;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PurchaseOrderDetailsRecord extends UpdatableRecordImpl<PurchaseOrderDetailsRecord> implements Record8<Integer, Integer, Integer, BigDecimal, BigDecimal, Timestamp, Byte, Integer> {

    private static final long serialVersionUID = -1079189139;

    /**
     * Setter for <code>northwind.purchase_order_details.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.purchase_order_id</code>.
     */
    public void setPurchaseOrderId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.purchase_order_id</code>.
     */
    public Integer getPurchaseOrderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.product_id</code>.
     */
    public void setProductId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.product_id</code>.
     */
    public Integer getProductId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.quantity</code>.
     */
    public void setQuantity(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.quantity</code>.
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.unit_cost</code>.
     */
    public void setUnitCost(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.unit_cost</code>.
     */
    public BigDecimal getUnitCost() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.date_received</code>.
     */
    public void setDateReceived(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.date_received</code>.
     */
    public Timestamp getDateReceived() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.posted_to_inventory</code>.
     */
    public void setPostedToInventory(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.posted_to_inventory</code>.
     */
    public Byte getPostedToInventory() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>northwind.purchase_order_details.inventory_id</code>.
     */
    public void setInventoryId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>northwind.purchase_order_details.inventory_id</code>.
     */
    public Integer getInventoryId() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, BigDecimal, Timestamp, Byte, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, BigDecimal, Timestamp, Byte, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.PURCHASE_ORDER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.PRODUCT_ID;
    }

    @Override
    public Field<BigDecimal> field4() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.QUANTITY;
    }

    @Override
    public Field<BigDecimal> field5() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.UNIT_COST;
    }

    @Override
    public Field<Timestamp> field6() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.DATE_RECEIVED;
    }

    @Override
    public Field<Byte> field7() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.POSTED_TO_INVENTORY;
    }

    @Override
    public Field<Integer> field8() {
        return PurchaseOrderDetails.PURCHASE_ORDER_DETAILS.INVENTORY_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPurchaseOrderId();
    }

    @Override
    public Integer component3() {
        return getProductId();
    }

    @Override
    public BigDecimal component4() {
        return getQuantity();
    }

    @Override
    public BigDecimal component5() {
        return getUnitCost();
    }

    @Override
    public Timestamp component6() {
        return getDateReceived();
    }

    @Override
    public Byte component7() {
        return getPostedToInventory();
    }

    @Override
    public Integer component8() {
        return getInventoryId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPurchaseOrderId();
    }

    @Override
    public Integer value3() {
        return getProductId();
    }

    @Override
    public BigDecimal value4() {
        return getQuantity();
    }

    @Override
    public BigDecimal value5() {
        return getUnitCost();
    }

    @Override
    public Timestamp value6() {
        return getDateReceived();
    }

    @Override
    public Byte value7() {
        return getPostedToInventory();
    }

    @Override
    public Integer value8() {
        return getInventoryId();
    }

    @Override
    public PurchaseOrderDetailsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value2(Integer value) {
        setPurchaseOrderId(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value3(Integer value) {
        setProductId(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value4(BigDecimal value) {
        setQuantity(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value5(BigDecimal value) {
        setUnitCost(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value6(Timestamp value) {
        setDateReceived(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value7(Byte value) {
        setPostedToInventory(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord value8(Integer value) {
        setInventoryId(value);
        return this;
    }

    @Override
    public PurchaseOrderDetailsRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, BigDecimal value5, Timestamp value6, Byte value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PurchaseOrderDetailsRecord
     */
    public PurchaseOrderDetailsRecord() {
        super(PurchaseOrderDetails.PURCHASE_ORDER_DETAILS);
    }

    /**
     * Create a detached, initialised PurchaseOrderDetailsRecord
     */
    public PurchaseOrderDetailsRecord(Integer id, Integer purchaseOrderId, Integer productId, BigDecimal quantity, BigDecimal unitCost, Timestamp dateReceived, Byte postedToInventory, Integer inventoryId) {
        super(PurchaseOrderDetails.PURCHASE_ORDER_DETAILS);

        set(0, id);
        set(1, purchaseOrderId);
        set(2, productId);
        set(3, quantity);
        set(4, unitCost);
        set(5, dateReceived);
        set(6, postedToInventory);
        set(7, inventoryId);
    }
}