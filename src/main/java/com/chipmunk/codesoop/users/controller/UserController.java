package com.chipmunk.codesoop.users.controller;

import com.chipmunk.codesoop.users.dto.RegisterUserDTO;
import com.chipmunk.codesoop.users.dto.ResponseUserDTO;
import com.chipmunk.codesoop.users.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<?> register(
            @RequestBody RegisterUserDTO registerUserDTO
    ){
        try {
            ResponseUserDTO user = this.userService.register(registerUserDTO);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return ResponseEntity
                    .badRequest()
                    .body(e.getMessage());
        }
    }
}
