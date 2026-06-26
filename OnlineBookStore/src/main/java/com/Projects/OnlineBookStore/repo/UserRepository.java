package com.Projects.OnlineBookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projects.OnlineBookStore.entity.User;

public interface UserRepository
extends JpaRepository<User,Long>{

User findByUsername(
String username
);

}
