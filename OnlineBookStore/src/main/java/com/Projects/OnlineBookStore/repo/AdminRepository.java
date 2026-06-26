package com.Projects.OnlineBookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projects.OnlineBookStore.entity.Admin;

public interface AdminRepository
extends JpaRepository<Admin,Long>{

Admin findByUsername(
String username
);

}
