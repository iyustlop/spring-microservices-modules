package com.freelance.spring.controller;

import com.freelance.spring.services.TestSuiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test-suites")
public class TestSuiteController {

    private final TestSuiteService testSuiteService;

    @PostMapping
    public ResponseEntity<String> createTestSuite() {
        return ResponseEntity.ok(testSuiteService.createTestSuite());
    }

    @GetMapping("/{testSuiteId}")
    public ResponseEntity<String> getTestSuiteByID(@PathVariable String testSuiteId) {
        return ResponseEntity.ok(testSuiteService.getTestSuiteByID(testSuiteId));
    }

    @GetMapping("/by-test-plan")
    public ResponseEntity<String> getTestSuitesForTestPlan() {
        return ResponseEntity.ok(testSuiteService.getTestSuitesForTestPlan());
    }

    @PostMapping("/attachments")
    public ResponseEntity<String> uploadTestSuiteAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(testSuiteService.uploadTestSuiteAttachment(file));
    }

    @GetMapping("/by-test-suite")
    public ResponseEntity<String> getTestSuitesForTestSuite() {
        return ResponseEntity.ok(testSuiteService.getTestSuitesForTestSuite());
    }

    @GetMapping("/first-level-by-test-project")
    public ResponseEntity<String> getFirstLevelTestSuitesForTestProject() {
        return ResponseEntity.ok(testSuiteService.getFirstLevelTestSuitesForTestProject());
    }

}
