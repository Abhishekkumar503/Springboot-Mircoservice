package com.practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springboot.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}