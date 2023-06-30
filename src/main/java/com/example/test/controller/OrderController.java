package com.example.test.controller;

import com.example.test.entity.Department;
import com.example.test.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello WOrld";
    }
    @PostMapping("/save")
    public Department save(@RequestBody Department dept){
        return orderService.saveOrder(dept);
    }


}
