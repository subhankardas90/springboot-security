package com.example.test.service;

import com.example.test.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    public Department saveOrder(Department dept);
}
