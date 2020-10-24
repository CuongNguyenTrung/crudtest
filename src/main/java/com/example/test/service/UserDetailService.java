package com.example.test.service;


import com.example.test.entity.UserDetail;
import com.example.test.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    public List<UserDetail> getAll() {
        return userDetailRepository.findAll();
    }
}
