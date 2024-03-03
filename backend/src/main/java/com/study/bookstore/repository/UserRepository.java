package com.study.bookstore.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.bookstore.models.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
