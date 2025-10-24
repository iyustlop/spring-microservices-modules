package com.freelance.spring.services;

import org.springframework.stereotype.Service;

@Service
public interface BuildService {

    String createBuild();
    String getBuildsForTestPlan();
    String getLatestBuildForTestPlan();
    String updateBuildCustomFieldsValues();

}
