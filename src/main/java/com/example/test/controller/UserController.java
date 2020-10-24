package com.example.test.controller;

import com.example.test.entity.Order;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    private List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}/orders")
    private List<Order> getAllOrders(@PathVariable int id) {
        return userService.getOrdersByIdUser(id);
    }
}
