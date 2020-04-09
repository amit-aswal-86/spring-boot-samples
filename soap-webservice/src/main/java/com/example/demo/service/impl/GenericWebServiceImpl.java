package com.example.demo.service.impl;

import com.example.demo.service.GenericWebService;

public class GenericWebServiceImpl implements GenericWebService {

    @Override
    public int sum(int a, int b) {
        return (a + b);
    }
}
