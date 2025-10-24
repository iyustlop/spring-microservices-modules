package com.freelance.spring.controller;

import com.freelance.spring.services.TestCaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test-cases")
public class TestCaseController {

    private final TestCaseService testCaseService;

    @PostMapping
    public ResponseEntity<String> createTestCase() {
        return ResponseEntity.ok(testCaseService.createTestCase());
    }

    @PutMapping
    public ResponseEntity<String> updateTestCase() {
        return ResponseEntity.ok(testCaseService.updateTestCase());
    }

    @PostMapping("/steps")
    public ResponseEntity<String> createTestCaseSteps() {
        return ResponseEntity.ok(testCaseService.createTestCaseSteps());
    }

    @DeleteMapping("/steps")
    public ResponseEntity<String> deleteTestCaseSteps() {
        return ResponseEntity.ok(testCaseService.deleteTestCaseSteps());
    }

    @PostMapping("/add-to-plan")
    public ResponseEntity<String> addTestCaseToTestPlan() {
        return ResponseEntity.ok(testCaseService.addTestCaseToTestPlan());
    }

    @GetMapping
    public ResponseEntity<String> getTestCase() {
        return ResponseEntity.ok(testCaseService.getTestCase());
    }

    @GetMapping("/by-test-suite")
    public ResponseEntity<String> getTestCasesForTestSuite() {
        return ResponseEntity.ok(testCaseService.getTestCasesForTestSuite());
    }

    @GetMapping("/by-test-plan")
    public ResponseEntity<String> getTestCasesForTestPlan() {
        return ResponseEntity.ok(testCaseService.getTestCasesForTestPlan());
    }

    @GetMapping("/by-name")
    public ResponseEntity<String> getTestCaseIDByName() {
        return ResponseEntity.ok(testCaseService.getTestCaseIDByName());
    }

    @PostMapping("/attachments")
    public ResponseEntity<String> uploadTestCaseAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(testCaseService.uploadTestCaseAttachment(file));
    }

    @GetMapping("/attachments")
    public ResponseEntity<String> getTestCaseAttachments() {
        return ResponseEntity.ok(testCaseService.getTestCaseAttachments());
    }

    @GetMapping("/keywords")
    public ResponseEntity<String> getTestCaseKeywords() {
        return ResponseEntity.ok(testCaseService.getTestCaseKeywords());
    }

    @GetMapping("/custom-fields/design-value")
    public ResponseEntity<String> getTestCaseCustomFieldDesignValue() {
        return ResponseEntity.ok(testCaseService.getTestCaseCustomFieldDesignValue());
    }

    @GetMapping("/custom-fields/test-plan-design-value")
    public ResponseEntity<String> getTestCaseCustomFieldTestPlanDesignValue() {
        return ResponseEntity.ok(testCaseService.getTestCaseCustomFieldTestPlanDesignValue());
    }

    @GetMapping("/custom-fields/execution-value")
    public ResponseEntity<String> getTestCaseCustomFieldExecutionValue() {
        return ResponseEntity.ok(testCaseService.getTestCaseCustomFieldExecutionValue());
    }

    @PutMapping("/custom-fields/design-value")
    public ResponseEntity<String> updateTestCaseCustomFieldDesignValue() {
        return ResponseEntity.ok(testCaseService.updateTestCaseCustomFieldDesignValue());
    }

    @PutMapping("/execution-type")
    public ResponseEntity<String> setTestCaseExecutionType() {
        return ResponseEntity.ok(testCaseService.setTestCaseExecutionType());
    }

}
