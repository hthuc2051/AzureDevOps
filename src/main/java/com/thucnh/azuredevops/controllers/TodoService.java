package com.thucnh.azuredevops.controllers;


import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public Integer compute(Integer a, Integer b) {
        return a + b;
    }
}
