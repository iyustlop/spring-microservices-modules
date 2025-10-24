package com.freelance.spring.services.impl;

import com.freelance.spring.services.UtilService;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

    @Override
    public String sayHello() {
        return "sayHello";
    }

    @Override
    public String about() {
        return "about";
    }

    @Override
    public String setTestMode() {
        return "setTestMode";
    }

    @Override
    public String repeat() {
        return "repeat";
    }

    @Override
    public String getFullPath() {
        return "getFullPath";
    }

}
