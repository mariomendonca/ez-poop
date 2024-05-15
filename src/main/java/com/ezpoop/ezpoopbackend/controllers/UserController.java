package com.ezpoop.ezpoopbackend.controllers;

import com.ezpoop.ezpoopbackend.domains.entities.User;
import com.ezpoop.ezpoopbackend.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.getById(id));
    }
}
