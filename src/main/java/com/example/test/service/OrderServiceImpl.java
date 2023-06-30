package com.example.test.service;

import com.example.test.entity.Department;
import com.example.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public Department saveOrder(Department dept) {

        Department d = new Department();
        d.setDepartmentId(1L);
        d.setDepartmentAddress("Test");
        d.setDepartmentName("test");
        d.setDepartmentCode("test");
        return d;
        //return orderRepository.save(dept);
    }
}
