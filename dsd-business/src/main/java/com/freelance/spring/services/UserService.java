package com.freelance.spring.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String doesUserExist();
    String getUserByLogin();

}
