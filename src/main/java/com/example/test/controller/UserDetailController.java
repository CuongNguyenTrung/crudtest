package com.example.test.controller;

import com.example.test.entity.UserDetail;
import com.example.test.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userdetails")
public class UserDetailController {

    @Autowired
    private UserDetailService userDetailService;

    @GetMapping
    public List<UserDetail> getAll() {
        return userDetailService.getAll();
    }


}
