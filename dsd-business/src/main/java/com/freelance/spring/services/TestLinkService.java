package com.freelance.spring.services;

import org.springframework.web.multipart.MultipartFile;

public interface TestLinkService {
    String checkDevKey(String devKey);
    String createTestProject(String projectName, String projectPrefix);
    String getTestProjectByName(String projectName);
    String getProjects();
    String createTestPlan(String planName, String projectName);
    String getTestPlanByName(String planName, String projectName);
    String getProjectTestPlans(String projectName);
    String getTestPlanPlatforms(String planName);
    String uploadTestProjectAttachment(MultipartFile file);
    String getTotalsForTestPlan(String planName);
    String getExecCountersByBuild(String buildName);
    String getProjectPlatforms(String projectName);
    String removePlatformFromTestPlan(String planName, String platformName);
    String addPlatformToTestPlan(String planName, String platformName);
}
