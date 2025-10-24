package com.freelance.spring.services.impl;

import com.freelance.spring.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String doesUserExist() {
        return "doesUserExist";
    }

    @Override
    public String getUserByLogin() {
        return "getUserByLogin";
    }

}
