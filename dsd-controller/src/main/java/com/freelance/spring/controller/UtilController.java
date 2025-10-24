package com.freelance.spring.controller;

import com.freelance.spring.services.UtilService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/utils")
public class UtilController {

    private final UtilService utilService;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok(utilService.sayHello());
    }

    @GetMapping("/about")
    public ResponseEntity<String> about() {
        return ResponseEntity.ok(utilService.about());
    }

    @GetMapping("/test-mode")
    public ResponseEntity<String> setTestMode() {
        return ResponseEntity.ok(utilService.setTestMode());
    }

    @GetMapping("/repeat")
    public ResponseEntity<String> repeat() {
        return ResponseEntity.ok(utilService.repeat());
    }

    @GetMapping("/full-path")
    public ResponseEntity<String> getFullPath() {
        return ResponseEntity.ok(utilService.getFullPath());
    }

}
