package com.example.authorizationservice.controller;

import com.example.authorizationservice.dto.AuthRequest;
import com.example.authorizationservice.entity.User;
import com.example.authorizationservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController{
    @Autowired
    private AuthService authService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public User addNewUser(@RequestBody User user) {
        return authService.saveUser(user);
    }

    @PostMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authenticate.isAuthenticated()) {
            return authService.generateJwtToken(authRequest.getUsername());
        } throw new RuntimeException("Authentication failed");
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token){
        authService.validateJwtToken(token);
        return "Token is valid";
    }
}
