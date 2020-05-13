package com.jooq.example.service;

import com.jooq.example.domain.tables.pojos.Customers;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final DSLContext dslContext;

    public CustomerService(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<Customers> getAllCustomers() {
        return dslContext.select()
                .from(com.jooq.example.domain.tables.Customers.CUSTOMERS)
                .fetch()
                .into(Customers.class);
    }
}
