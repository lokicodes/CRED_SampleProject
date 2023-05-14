package com.example.CRED_sample_project.lokesh.service;

import com.example.CRED_sample_project.lokesh.entity.User;
import com.example.CRED_sample_project.lokesh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User createUser(User user)
    {
        return repository.save(user);
    }

    public List<User> getUsers()
    {
        return repository.findAll();
    }

    public User getUserById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public String hardDeleteUser(int id)
    {
        repository.deleteById(id);
        return "User having id: " + id + " deleted permanently!";
    }

    public String softDeleteUser(int id)
    {
        User existingUser = repository.findById(id).orElse(null);
        existingUser.setDeleted(true);
        repository.save(existingUser);
        return "User having id:" + id + " deleted softly!";
    }

    public User updateUser(User changedUser)
    {
        User existingUser = repository.findById(changedUser.getId()).orElse(null);
        existingUser.setName(changedUser.getName());
        existingUser.setAge(changedUser.getAge());
        existingUser.setEmail(changedUser.getEmail());
        return repository.save(existingUser);
    }
}
