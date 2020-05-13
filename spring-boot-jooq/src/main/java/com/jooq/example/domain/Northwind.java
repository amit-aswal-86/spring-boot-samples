/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain;


import com.jooq.example.domain.tables.Customers;
import com.jooq.example.domain.tables.EmployeePrivileges;
import com.jooq.example.domain.tables.Employees;
import com.jooq.example.domain.tables.InventoryTransactionTypes;
import com.jooq.example.domain.tables.InventoryTransactions;
import com.jooq.example.domain.tables.Invoices;
import com.jooq.example.domain.tables.OrderDetails;
import com.jooq.example.domain.tables.OrderDetailsStatus;
import com.jooq.example.domain.tables.Orders;
import com.jooq.example.domain.tables.OrdersStatus;
import com.jooq.example.domain.tables.OrdersTaxStatus;
import com.jooq.example.domain.tables.Privileges;
import com.jooq.example.domain.tables.Products;
import com.jooq.example.domain.tables.PurchaseOrderDetails;
import com.jooq.example.domain.tables.PurchaseOrderStatus;
import com.jooq.example.domain.tables.PurchaseOrders;
import com.jooq.example.domain.tables.SalesReports;
import com.jooq.example.domain.tables.Shippers;
import com.jooq.example.domain.tables.Strings;
import com.jooq.example.domain.tables.Suppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Northwind extends SchemaImpl {

    private static final long serialVersionUID = -1059124876;

    /**
     * The reference instance of <code>northwind</code>
     */
    public static final Northwind NORTHWIND = new Northwind();

    /**
     * The table <code>northwind.customers</code>.
     */
    public final Customers CUSTOMERS = com.jooq.example.domain.tables.Customers.CUSTOMERS;

    /**
     * The table <code>northwind.employees</code>.
     */
    public final Employees EMPLOYEES = com.jooq.example.domain.tables.Employees.EMPLOYEES;

    /**
     * The table <code>northwind.employee_privileges</code>.
     */
    public final EmployeePrivileges EMPLOYEE_PRIVILEGES = com.jooq.example.domain.tables.EmployeePrivileges.EMPLOYEE_PRIVILEGES;

    /**
     * The table <code>northwind.inventory_transactions</code>.
     */
    public final InventoryTransactions INVENTORY_TRANSACTIONS = com.jooq.example.domain.tables.InventoryTransactions.INVENTORY_TRANSACTIONS;

    /**
     * The table <code>northwind.inventory_transaction_types</code>.
     */
    public final InventoryTransactionTypes INVENTORY_TRANSACTION_TYPES = com.jooq.example.domain.tables.InventoryTransactionTypes.INVENTORY_TRANSACTION_TYPES;

    /**
     * The table <code>northwind.invoices</code>.
     */
    public final Invoices INVOICES = com.jooq.example.domain.tables.Invoices.INVOICES;

    /**
     * The table <code>northwind.orders</code>.
     */
    public final Orders ORDERS = com.jooq.example.domain.tables.Orders.ORDERS;

    /**
     * The table <code>northwind.orders_status</code>.
     */
    public final OrdersStatus ORDERS_STATUS = com.jooq.example.domain.tables.OrdersStatus.ORDERS_STATUS;

    /**
     * The table <code>northwind.orders_tax_status</code>.
     */
    public final OrdersTaxStatus ORDERS_TAX_STATUS = com.jooq.example.domain.tables.OrdersTaxStatus.ORDERS_TAX_STATUS;

    /**
     * The table <code>northwind.order_details</code>.
     */
    public final OrderDetails ORDER_DETAILS = com.jooq.example.domain.tables.OrderDetails.ORDER_DETAILS;

    /**
     * The table <code>northwind.order_details_status</code>.
     */
    public final OrderDetailsStatus ORDER_DETAILS_STATUS = com.jooq.example.domain.tables.OrderDetailsStatus.ORDER_DETAILS_STATUS;

    /**
     * The table <code>northwind.privileges</code>.
     */
    public final Privileges PRIVILEGES = com.jooq.example.domain.tables.Privileges.PRIVILEGES;

    /**
     * The table <code>northwind.products</code>.
     */
    public final Products PRODUCTS = com.jooq.example.domain.tables.Products.PRODUCTS;

    /**
     * The table <code>northwind.purchase_orders</code>.
     */
    public final PurchaseOrders PURCHASE_ORDERS = com.jooq.example.domain.tables.PurchaseOrders.PURCHASE_ORDERS;

    /**
     * The table <code>northwind.purchase_order_details</code>.
     */
    public final PurchaseOrderDetails PURCHASE_ORDER_DETAILS = com.jooq.example.domain.tables.PurchaseOrderDetails.PURCHASE_ORDER_DETAILS;

    /**
     * The table <code>northwind.purchase_order_status</code>.
     */
    public final PurchaseOrderStatus PURCHASE_ORDER_STATUS = com.jooq.example.domain.tables.PurchaseOrderStatus.PURCHASE_ORDER_STATUS;

    /**
     * The table <code>northwind.sales_reports</code>.
     */
    public final SalesReports SALES_REPORTS = com.jooq.example.domain.tables.SalesReports.SALES_REPORTS;

    /**
     * The table <code>northwind.shippers</code>.
     */
    public final Shippers SHIPPERS = com.jooq.example.domain.tables.Shippers.SHIPPERS;

    /**
     * The table <code>northwind.strings</code>.
     */
    public final Strings STRINGS = com.jooq.example.domain.tables.Strings.STRINGS;

    /**
     * The table <code>northwind.suppliers</code>.
     */
    public final Suppliers SUPPLIERS = com.jooq.example.domain.tables.Suppliers.SUPPLIERS;

    /**
     * No further instances allowed
     */
    private Northwind() {
        super("northwind", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Customers.CUSTOMERS,
            Employees.EMPLOYEES,
            EmployeePrivileges.EMPLOYEE_PRIVILEGES,
            InventoryTransactions.INVENTORY_TRANSACTIONS,
            InventoryTransactionTypes.INVENTORY_TRANSACTION_TYPES,
            Invoices.INVOICES,
            Orders.ORDERS,
            OrdersStatus.ORDERS_STATUS,
            OrdersTaxStatus.ORDERS_TAX_STATUS,
            OrderDetails.ORDER_DETAILS,
            OrderDetailsStatus.ORDER_DETAILS_STATUS,
            Privileges.PRIVILEGES,
            Products.PRODUCTS,
            PurchaseOrders.PURCHASE_ORDERS,
            PurchaseOrderDetails.PURCHASE_ORDER_DETAILS,
            PurchaseOrderStatus.PURCHASE_ORDER_STATUS,
            SalesReports.SALES_REPORTS,
            Shippers.SHIPPERS,
            Strings.STRINGS,
            Suppliers.SUPPLIERS);
    }
}