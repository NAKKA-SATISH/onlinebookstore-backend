package com.Projects.OnlineBookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Projects.OnlineBookStore.entity.User;
import com.Projects.OnlineBookStore.repo.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        return repo.save(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User db = repo.findByUsername(
                user.getUsername()
        );

        if (db != null &&
                db.getPassword().equals(
                        user.getPassword()
                )) {

            return "SUCCESS";

        }
        return "INVALID";
    }
}
