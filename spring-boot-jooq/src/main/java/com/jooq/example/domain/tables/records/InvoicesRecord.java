/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables.records;


import com.jooq.example.domain.tables.Invoices;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class InvoicesRecord extends UpdatableRecordImpl<InvoicesRecord> implements Record7<Integer, Integer, Timestamp, Timestamp, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -145474246;

    /**
     * Setter for <code>northwind.invoices.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>northwind.invoices.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>northwind.invoices.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>northwind.invoices.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>northwind.invoices.invoice_date</code>.
     */
    public void setInvoiceDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>northwind.invoices.invoice_date</code>.
     */
    public Timestamp getInvoiceDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>northwind.invoices.due_date</code>.
     */
    public void setDueDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>northwind.invoices.due_date</code>.
     */
    public Timestamp getDueDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>northwind.invoices.tax</code>.
     */
    public void setTax(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>northwind.invoices.tax</code>.
     */
    public BigDecimal getTax() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>northwind.invoices.shipping</code>.
     */
    public void setShipping(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>northwind.invoices.shipping</code>.
     */
    public BigDecimal getShipping() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>northwind.invoices.amount_due</code>.
     */
    public void setAmountDue(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>northwind.invoices.amount_due</code>.
     */
    public BigDecimal getAmountDue() {
        return (BigDecimal) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Timestamp, Timestamp, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, Timestamp, Timestamp, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Invoices.INVOICES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Invoices.INVOICES.ORDER_ID;
    }

    @Override
    public Field<Timestamp> field3() {
        return Invoices.INVOICES.INVOICE_DATE;
    }

    @Override
    public Field<Timestamp> field4() {
        return Invoices.INVOICES.DUE_DATE;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Invoices.INVOICES.TAX;
    }

    @Override
    public Field<BigDecimal> field6() {
        return Invoices.INVOICES.SHIPPING;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Invoices.INVOICES.AMOUNT_DUE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getOrderId();
    }

    @Override
    public Timestamp component3() {
        return getInvoiceDate();
    }

    @Override
    public Timestamp component4() {
        return getDueDate();
    }

    @Override
    public BigDecimal component5() {
        return getTax();
    }

    @Override
    public BigDecimal component6() {
        return getShipping();
    }

    @Override
    public BigDecimal component7() {
        return getAmountDue();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getOrderId();
    }

    @Override
    public Timestamp value3() {
        return getInvoiceDate();
    }

    @Override
    public Timestamp value4() {
        return getDueDate();
    }

    @Override
    public BigDecimal value5() {
        return getTax();
    }

    @Override
    public BigDecimal value6() {
        return getShipping();
    }

    @Override
    public BigDecimal value7() {
        return getAmountDue();
    }

    @Override
    public InvoicesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public InvoicesRecord value2(Integer value) {
        setOrderId(value);
        return this;
    }

    @Override
    public InvoicesRecord value3(Timestamp value) {
        setInvoiceDate(value);
        return this;
    }

    @Override
    public InvoicesRecord value4(Timestamp value) {
        setDueDate(value);
        return this;
    }

    @Override
    public InvoicesRecord value5(BigDecimal value) {
        setTax(value);
        return this;
    }

    @Override
    public InvoicesRecord value6(BigDecimal value) {
        setShipping(value);
        return this;
    }

    @Override
    public InvoicesRecord value7(BigDecimal value) {
        setAmountDue(value);
        return this;
    }

    @Override
    public InvoicesRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, BigDecimal value5, BigDecimal value6, BigDecimal value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoicesRecord
     */
    public InvoicesRecord() {
        super(Invoices.INVOICES);
    }

    /**
     * Create a detached, initialised InvoicesRecord
     */
    public InvoicesRecord(Integer id, Integer orderId, Timestamp invoiceDate, Timestamp dueDate, BigDecimal tax, BigDecimal shipping, BigDecimal amountDue) {
        super(Invoices.INVOICES);

        set(0, id);
        set(1, orderId);
        set(2, invoiceDate);
        set(3, dueDate);
        set(4, tax);
        set(5, shipping);
        set(6, amountDue);
    }
}
