package com.thucnh.azuredevops.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Integer> computeTwoInteger(Integer a, Integer b) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(compute(a, b));
    }

    public Integer compute(Integer a, Integer b) {
        return a + b;
    }
    @GetMapping("/getIntNum")
    public ResponseEntity<Integer> getInteger() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(1);
    }
}
