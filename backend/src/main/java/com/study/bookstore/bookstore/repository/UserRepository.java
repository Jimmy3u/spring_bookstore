package com.study.bookstore.bookstore.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.bookstore.bookstore.models.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
