package com.freelance.spring.controller;

import com.freelance.spring.services.BuildService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/builds")
public class BuildController {

    private final BuildService buildService;

    @PostMapping
    public ResponseEntity<String> createBuild() {
        return ResponseEntity.ok(buildService.createBuild());
    }

    @GetMapping("/by-test-plan")
    public ResponseEntity<String> getBuildsForTestPlan() {
        return ResponseEntity.ok(buildService.getBuildsForTestPlan());
    }

    @GetMapping("/latest-by-test-plan")
    public ResponseEntity<String> getLatestBuildForTestPlan() {
        return ResponseEntity.ok(buildService.getLatestBuildForTestPlan());
    }

    @PutMapping("/custom-fields")
    public ResponseEntity<String> updateBuildCustomFieldsValues() {
        return ResponseEntity.ok(buildService.updateBuildCustomFieldsValues());
    }

}
