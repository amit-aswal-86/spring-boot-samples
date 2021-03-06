/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;


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
public class Invoices implements Serializable {

    private static final long serialVersionUID = -1124627599;

    private Integer    id;
    private Integer    orderId;
    private Timestamp  invoiceDate;
    private Timestamp  dueDate;
    private BigDecimal tax;
    private BigDecimal shipping;
    private BigDecimal amountDue;

    public Invoices() {}

    public Invoices(Invoices value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.invoiceDate = value.invoiceDate;
        this.dueDate = value.dueDate;
        this.tax = value.tax;
        this.shipping = value.shipping;
        this.amountDue = value.amountDue;
    }

    public Invoices(
        Integer    id,
        Integer    orderId,
        Timestamp  invoiceDate,
        Timestamp  dueDate,
        BigDecimal tax,
        BigDecimal shipping,
        BigDecimal amountDue
    ) {
        this.id = id;
        this.orderId = orderId;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.tax = tax;
        this.shipping = shipping;
        this.amountDue = amountDue;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Timestamp getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Timestamp getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getShipping() {
        return this.shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getAmountDue() {
        return this.amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Invoices (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(invoiceDate);
        sb.append(", ").append(dueDate);
        sb.append(", ").append(tax);
        sb.append(", ").append(shipping);
        sb.append(", ").append(amountDue);

        sb.append(")");
        return sb.toString();
    }
}
