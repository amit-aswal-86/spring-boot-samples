package com.jooq.example.rest;

import com.jooq.example.domain.tables.pojos.Customers;
import com.jooq.example.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {
    private final CustomerService customerService;

    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public List<Customers> list() {
        return this.customerService.getAllCustomers();
    }
}
