package com.freelance.spring.controller;

import com.freelance.spring.services.TestLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/testlink")
public class TestLinkController {

    private final TestLinkService testLinkService;

    @GetMapping("/check-dev-key")
    public ResponseEntity<String> checkDevKey(@RequestParam String devKey) {
        return ResponseEntity.ok(testLinkService.checkDevKey(devKey));
    }

    @PostMapping("/testprojects")
    public ResponseEntity<String> createTestProject(@RequestParam String projectName, @RequestParam String projectPrefix) {
        return ResponseEntity.ok(testLinkService.createTestProject(projectName, projectPrefix));
    }

    @GetMapping("/testprojects/by-name")
    public ResponseEntity<String> getTestProjectByName(@RequestParam String projectName) {
        return ResponseEntity.ok(testLinkService.getTestProjectByName(projectName));
    }

    @GetMapping("/testprojects")
    public ResponseEntity<String> getProjects() {
        return ResponseEntity.ok(testLinkService.getProjects());
    }

    @PostMapping("/testplans")
    public ResponseEntity<String> createTestPlan(@RequestParam String planName, @RequestParam String projectName) {
        return ResponseEntity.ok(testLinkService.createTestPlan(planName, projectName));
    }

    @GetMapping("/testplans/by-name")
    public ResponseEntity<String> getTestPlanByName(@RequestParam String planName, @RequestParam String projectName) {
        return ResponseEntity.ok(testLinkService.getTestPlanByName(planName, projectName));
    }

    @GetMapping("/testprojects/testplans")
    public ResponseEntity<String> getProjectTestPlans(@RequestParam String projectName) {
        return ResponseEntity.ok(testLinkService.getProjectTestPlans(projectName));
    }

    @GetMapping("/testplans/platforms")
    public ResponseEntity<String> getTestPlanPlatforms(@RequestParam String planName) {
        return ResponseEntity.ok(testLinkService.getTestPlanPlatforms(planName));
    }

    @PostMapping("/testprojects/attachments")
    public ResponseEntity<String> uploadTestProjectAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(testLinkService.uploadTestProjectAttachment(file));
    }

    @GetMapping("/testplans/totals")
    public ResponseEntity<String> getTotalsForTestPlan(@RequestParam String planName) {
        return ResponseEntity.ok(testLinkService.getTotalsForTestPlan(planName));
    }

    @GetMapping("/builds/exec-counters")
    public ResponseEntity<String> getExecCountersByBuild(@RequestParam String buildName) {
        return ResponseEntity.ok(testLinkService.getExecCountersByBuild(buildName));
    }

    @GetMapping("/projects/platforms")
    public ResponseEntity<String> getProjectPlatforms(@RequestParam String projectName) {
        return ResponseEntity.ok(testLinkService.getProjectPlatforms(projectName));
    }

    @DeleteMapping("/testplans/platforms")
    public ResponseEntity<String> removePlatformFromTestPlan(@RequestParam String planName, @RequestParam String platformName) {
        return ResponseEntity.ok(testLinkService.removePlatformFromTestPlan(planName, platformName));
    }

    @PostMapping("/testplans/platforms")
    public ResponseEntity<String> addPlatformToTestPlan(@RequestParam String planName, @RequestParam String platformName) {
        return ResponseEntity.ok(testLinkService.addPlatformToTestPlan(planName, platformName));
    }
}
