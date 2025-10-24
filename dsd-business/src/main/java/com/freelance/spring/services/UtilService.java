package com.freelance.spring.services;

import org.springframework.stereotype.Service;

@Service
public interface UtilService {

    String sayHello();
    String about();
    String setTestMode();
    String repeat();
    String getFullPath();

}
