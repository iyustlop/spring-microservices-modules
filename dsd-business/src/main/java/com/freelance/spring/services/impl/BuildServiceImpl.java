package com.freelance.spring.services.impl;

import com.freelance.spring.services.BuildService;
import org.springframework.stereotype.Service;

@Service
public class BuildServiceImpl implements BuildService {

    @Override
    public String createBuild() {
        return "createBuild";
    }

    @Override
    public String getBuildsForTestPlan() {
        return "getBuildsForTestPlan";
    }

    @Override
    public String getLatestBuildForTestPlan() {
        return "getLatestBuildForTestPlan";
    }

    @Override
    public String updateBuildCustomFieldsValues() {
        return "updateBuildCustomFieldsValues";
    }

}
