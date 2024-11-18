package com.project.tokenValid.controller;

import com.project.tokenValid.dto.LoginDTO;
import com.project.tokenValid.service.LoginService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<String> login(@Valid @RequestBody LoginDTO loginDTO) {
        try {
            String token = loginService.autenticar(loginDTO.getLogin(), loginDTO.getPassword());
            return ResponseEntity.ok(token);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(401).body(ex.getMessage());
        }
    }
}
