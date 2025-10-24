package com.freelance.spring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface TestCaseService {

    String createTestCase();
    String updateTestCase();
    String createTestCaseSteps();
    String deleteTestCaseSteps();
    String addTestCaseToTestPlan();
    String getTestCase();
    String getTestCasesForTestSuite();
    String getTestCasesForTestPlan();
    String getTestCaseIDByName();
    String uploadTestCaseAttachment(MultipartFile file);
    String getTestCaseAttachments();
    String getTestCaseKeywords();
    String getTestCaseCustomFieldDesignValue();
    String getTestCaseCustomFieldTestPlanDesignValue();
    String getTestCaseCustomFieldExecutionValue();
    String updateTestCaseCustomFieldDesignValue();
    String setTestCaseExecutionType();

}
