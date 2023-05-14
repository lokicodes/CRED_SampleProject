package com.example.CRED_sample_project.lokesh.controller;

import com.example.CRED_sample_project.lokesh.entity.User;
import com.example.CRED_sample_project.lokesh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<User> getUsers()
    {
        return service.getUsers();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id)
    {
        return service.getUserById(id);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser)
    {
        return service.createUser(newUser);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User updatedUser)
    {
        return service.updateUser(updatedUser);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id)
    {
        return service.softDeleteUser(id);
    }

    @DeleteMapping("/hardDelete/id")
    public String hardDeleteUser(@PathVariable int id)
    {
        return service.hardDeleteUser(id);
    }
}
