package com.example.week6.Controller;

import com.example.week6.Model.User;
import com.example.week6.Service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid User user){

        authService.register(user);
        return ResponseEntity.status(200).body("user registered");

    }

    public ResponseEntity logout(){
        return ResponseEntity.status(200).body("logout successfully");
    }
}
