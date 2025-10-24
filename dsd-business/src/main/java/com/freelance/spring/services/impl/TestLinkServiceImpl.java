package com.freelance.spring.services.impl;

import com.freelance.spring.services.TestLinkService;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

@Service
public class TestLinkServiceImpl implements TestLinkService {
    @Override
    public String checkDevKey(String devKey) {
        return "checkDevKey";
    }

    @Override
    public String createTestProject(String projectName, String projectPrefix) {
        return "createTestProject";
    }

    @Override
    public String getTestProjectByName(String projectName) {
        return "getTestProjectByName";
    }

    @Override
    public String getProjects() {
        return "getProjects";
    }

    @Override
    public String createTestPlan(String planName, String projectName) {
        return "createTestPlan";
    }

    @Override
    public String getTestPlanByName(String planName, String projectName) {
        return "getTestPlanByName";
    }

    @Override
    public String getProjectTestPlans(String projectName) {
        return "getProjectTestPlans";
    }

    @Override
    public String getTestPlanPlatforms(String planName) {
        return "getTestPlanPlatforms";
    }

    @Override
    public String uploadTestProjectAttachment(MultipartFile file) {
        return "uploadTestProjectAttachment";
    }

    @Override
    public String getTotalsForTestPlan(String planName) {
        return "getTotalsForTestPlan";
    }

    @Override
    public String getExecCountersByBuild(String buildName) {
        return "getExecCountersByBuild";
    }

    @Override
    public String getProjectPlatforms(String projectName) {
        return "getProjectPlatforms";
    }

    @Override
    public String removePlatformFromTestPlan(String planName, String platformName) {
        return "removePlatformFromTestPlan";
    }

    @Override
    public String addPlatformToTestPlan(String planName, String platformName) {
        return "addPlatformToTestPlan";
    }
}
