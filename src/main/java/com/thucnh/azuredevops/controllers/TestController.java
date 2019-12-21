package com.thucnh.azuredevops.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getString() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(generateString());
    }
    public String generateString(){
        return "Test DevOps";
    }
}
