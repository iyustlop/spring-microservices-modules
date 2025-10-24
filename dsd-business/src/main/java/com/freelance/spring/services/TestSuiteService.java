package com.freelance.spring.services;

import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

@Service
public interface TestSuiteService {

    String createTestSuite();
    String getTestSuiteByID(String testSuiteId);
    String getTestSuitesForTestPlan();
    String uploadTestSuiteAttachment(MultipartFile file);
    String getTestSuitesForTestSuite();
    String getFirstLevelTestSuitesForTestProject();

}
