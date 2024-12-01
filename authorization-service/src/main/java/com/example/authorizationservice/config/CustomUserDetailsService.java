package com.example.authorizationservice.config;

import com.example.authorizationservice.entity.User;
import com.example.authorizationservice.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserCredentialRepository userCredentialRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userCredential = userCredentialRepository.findByUsername(username);
        return userCredential.map(CustomUserDetailsObject::new).orElseThrow(()-> new UsernameNotFoundException("User not found with Username: "+ username));
    }
}
