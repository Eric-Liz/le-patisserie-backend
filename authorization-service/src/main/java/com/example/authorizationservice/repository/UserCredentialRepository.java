package com.example.authorizationservice.repository;

import com.example.authorizationservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
