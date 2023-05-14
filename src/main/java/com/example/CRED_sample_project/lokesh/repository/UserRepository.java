package com.example.CRED_sample_project.lokesh.repository;

import com.example.CRED_sample_project.lokesh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Integer> {
}
