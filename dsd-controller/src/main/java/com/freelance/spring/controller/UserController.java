package com.freelance.spring.controller;

import com.freelance.spring.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/does-user-exist")
    public ResponseEntity<String> doesUserExist() {
        return ResponseEntity.ok(userService.doesUserExist());
    }

    @GetMapping("/by-login")
    public ResponseEntity<String> getUserByLogin() {
        return ResponseEntity.ok(userService.getUserByLogin());
    }

}
