package com.example.test.service;


import com.example.test.entity.Order;
import com.example.test.entity.User;
import com.example.test.repository.OrderRepository;
import com.example.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public List<Order> getOrdersByIdUser(int id) {
        return orderRepository.getOrderByIdUser(id);
    }
}
