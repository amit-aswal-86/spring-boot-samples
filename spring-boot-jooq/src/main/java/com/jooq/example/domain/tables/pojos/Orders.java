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
public class Orders implements Serializable {

    private static final long serialVersionUID = -994721411;

    private Integer    id;
    private Integer    employeeId;
    private Integer    customerId;
    private Timestamp  orderDate;
    private Timestamp  shippedDate;
    private Integer    shipperId;
    private String     shipName;
    private String     shipAddress;
    private String     shipCity;
    private String     shipStateProvince;
    private String     shipZipPostalCode;
    private String     shipCountryRegion;
    private BigDecimal shippingFee;
    private BigDecimal taxes;
    private String     paymentType;
    private Timestamp  paidDate;
    private String     notes;
    private Double     taxRate;
    private Byte       taxStatusId;
    private Byte       statusId;

    public Orders() {}

    public Orders(Orders value) {
        this.id = value.id;
        this.employeeId = value.employeeId;
        this.customerId = value.customerId;
        this.orderDate = value.orderDate;
        this.shippedDate = value.shippedDate;
        this.shipperId = value.shipperId;
        this.shipName = value.shipName;
        this.shipAddress = value.shipAddress;
        this.shipCity = value.shipCity;
        this.shipStateProvince = value.shipStateProvince;
        this.shipZipPostalCode = value.shipZipPostalCode;
        this.shipCountryRegion = value.shipCountryRegion;
        this.shippingFee = value.shippingFee;
        this.taxes = value.taxes;
        this.paymentType = value.paymentType;
        this.paidDate = value.paidDate;
        this.notes = value.notes;
        this.taxRate = value.taxRate;
        this.taxStatusId = value.taxStatusId;
        this.statusId = value.statusId;
    }

    public Orders(
        Integer    id,
        Integer    employeeId,
        Integer    customerId,
        Timestamp  orderDate,
        Timestamp  shippedDate,
        Integer    shipperId,
        String     shipName,
        String     shipAddress,
        String     shipCity,
        String     shipStateProvince,
        String     shipZipPostalCode,
        String     shipCountryRegion,
        BigDecimal shippingFee,
        BigDecimal taxes,
        String     paymentType,
        Timestamp  paidDate,
        String     notes,
        Double     taxRate,
        Byte       taxStatusId,
        Byte       statusId
    ) {
        this.id = id;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipperId = shipperId;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipStateProvince = shipStateProvince;
        this.shipZipPostalCode = shipZipPostalCode;
        this.shipCountryRegion = shipCountryRegion;
        this.shippingFee = shippingFee;
        this.taxes = taxes;
        this.paymentType = paymentType;
        this.paidDate = paidDate;
        this.notes = notes;
        this.taxRate = taxRate;
        this.taxStatusId = taxStatusId;
        this.statusId = statusId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Timestamp getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Timestamp getShippedDate() {
        return this.shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipperId() {
        return this.shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipName() {
        return this.shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return this.shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipStateProvince() {
        return this.shipStateProvince;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public String getShipZipPostalCode() {
        return this.shipZipPostalCode;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public String getShipCountryRegion() {
        return this.shipCountryRegion;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public BigDecimal getShippingFee() {
        return this.shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxes() {
        return this.taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Timestamp getPaidDate() {
        return this.paidDate;
    }

    public void setPaidDate(Timestamp paidDate) {
        this.paidDate = paidDate;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Byte getTaxStatusId() {
        return this.taxStatusId;
    }

    public void setTaxStatusId(Byte taxStatusId) {
        this.taxStatusId = taxStatusId;
    }

    public Byte getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orders (");

        sb.append(id);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(orderDate);
        sb.append(", ").append(shippedDate);
        sb.append(", ").append(shipperId);
        sb.append(", ").append(shipName);
        sb.append(", ").append(shipAddress);
        sb.append(", ").append(shipCity);
        sb.append(", ").append(shipStateProvince);
        sb.append(", ").append(shipZipPostalCode);
        sb.append(", ").append(shipCountryRegion);
        sb.append(", ").append(shippingFee);
        sb.append(", ").append(taxes);
        sb.append(", ").append(paymentType);
        sb.append(", ").append(paidDate);
        sb.append(", ").append(notes);
        sb.append(", ").append(taxRate);
        sb.append(", ").append(taxStatusId);
        sb.append(", ").append(statusId);

        sb.append(")");
        return sb.toString();
    }
}
