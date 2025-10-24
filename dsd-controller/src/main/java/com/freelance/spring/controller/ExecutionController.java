package com.freelance.spring.controller;

import com.freelance.spring.services.ExecutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/executions")
public class ExecutionController {

    private final ExecutionService executionService;

    @DeleteMapping("/{executionId}")
    public ResponseEntity<String> deleteExecution(@PathVariable String executionId) {
        return ResponseEntity.ok(executionService.deleteExecution(executionId));
    }

    @PostMapping("/attachments")
    public ResponseEntity<String> uploadExecutionAttachment(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(executionService.uploadExecutionAttachment(file));
    }

}
