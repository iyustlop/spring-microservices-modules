package com.freelance.spring.services.impl;

import com.freelance.spring.services.TestCaseService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TestCaseServiceImpl implements TestCaseService {

    @Override
    public String createTestCase() {
        return "createTestCase";
    }

    @Override
    public String updateTestCase() {
        return "updateTestCase";
    }

    @Override
    public String createTestCaseSteps() {
        return "createTestCaseSteps";
    }

    @Override
    public String deleteTestCaseSteps() {
        return "deleteTestCaseSteps";
    }

    @Override
    public String addTestCaseToTestPlan() {
        return "addTestCaseToTestPlan";
    }

    @Override
    public String getTestCase() {
        return "getTestCase";
    }

    @Override
    public String getTestCasesForTestSuite() {
        return "getTestCasesForTestSuite";
    }

    @Override
    public String getTestCasesForTestPlan() {
        return "getTestCasesForTestPlan";
    }

    @Override
    public String getTestCaseIDByName() {
        return "getTestCaseIDByName";
    }

    @Override
    public String uploadTestCaseAttachment(MultipartFile file) {
        return "uploadTestCaseAttachment";
    }

    @Override
    public String getTestCaseAttachments() {
        return "getTestCaseAttachments";
    }

    @Override
    public String getTestCaseKeywords() {
        return "getTestCaseKeywords";
    }

    @Override
    public String getTestCaseCustomFieldDesignValue() {
        return "getTestCaseCustomFieldDesignValue";
    }

    @Override
    public String getTestCaseCustomFieldTestPlanDesignValue() {
        return "getTestCaseCustomFieldTestPlanDesignValue";
    }

    @Override
    public String getTestCaseCustomFieldExecutionValue() {
        return "getTestCaseCustomFieldExecutionValue";
    }

    @Override
    public String updateTestCaseCustomFieldDesignValue() {
        return "updateTestCaseCustomFieldDesignValue";
    }

    @Override
    public String setTestCaseExecutionType() {
        return "setTestCaseExecutionType";
    }
}
