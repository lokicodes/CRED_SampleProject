package com.example.CRED_sample_project.lokesh.repository;

import com.example.CRED_sample_project.lokesh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository
        extends JpaRepository<User, Integer> {
//    @Query("SELECT u FROM User u WHERE u.deleted = false")
//    List<User> findAllActiveUsers();
}
