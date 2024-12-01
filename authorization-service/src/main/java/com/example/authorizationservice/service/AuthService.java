package com.example.authorizationservice.service;

import com.example.authorizationservice.entity.User;
import com.example.authorizationservice.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtService jwtService;

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public String generateJwtToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateJwtToken(String token) {
        jwtService.validateToken(token);
    }
}
