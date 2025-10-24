package com.freelance.spring.services.impl;

import com.freelance.spring.services.TestSuiteService;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

@Service
public class TestSuiteServiceImpl implements TestSuiteService {

    @Override
    public String createTestSuite() {
        return "createTestSuite";
    }

    @Override
    public String getTestSuiteByID(String testSuiteId) {
        return "getTestSuiteByID";
    }

    @Override
    public String getTestSuitesForTestPlan() {
        return "getTestSuitesForTestPlan";
    }

    @Override
    public String uploadTestSuiteAttachment(MultipartFile file) {
        return "uploadTestSuiteAttachment";
    }

    @Override
    public String getTestSuitesForTestSuite() {
        return "getTestSuitesForTestSuite";
    }

    @Override
    public String getFirstLevelTestSuitesForTestProject() {
        return "getFirstLevelTestSuitesForTestProject";
    }

}
