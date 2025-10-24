package com.freelance.spring.controller;

import com.freelance.spring.services.RequirementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/requirements")
public class RequirementController {

    private final RequirementService requirementService;

    @PostMapping("/attachments")
    public ResponseEntity<String> uploadRequirementAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(requirementService.uploadRequirementAttachment(file));
    }

    @PostMapping("/specifications/attachments")
    public ResponseEntity<String> uploadRequirementSpecificationAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(requirementService.uploadRequirementSpecificationAttachment(file));
    }

    @PostMapping("/assign")
    public ResponseEntity<String> assignRequirements() {
        return ResponseEntity.ok(requirementService.assignRequirements());
    }

}
