package com.cinescopefinal.CineScope.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hi From USER....");
    }
}
