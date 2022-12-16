package com.springboot.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-api")
    public ResponseEntity<String> testApi(){
        return ResponseEntity.ok("Success 200 code");
    }
}
