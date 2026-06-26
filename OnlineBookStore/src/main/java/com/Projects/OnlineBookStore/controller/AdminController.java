package com.Projects.OnlineBookStore.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.Projects.OnlineBookStore.entity.Admin;
import com.Projects.OnlineBookStore.repo.AdminRepository;

@RestController

@RequestMapping("/admin")

@CrossOrigin(
origins = "http://localhost:3000"
)

public class AdminController {

@Autowired
private AdminRepository repo;


/* REGISTER ADMIN */

@PostMapping("/register")

public Admin register(

@RequestBody Admin admin

){

return repo.save(
admin
);

}


/* LOGIN */

@PostMapping("/login")

public String login(

@RequestBody Admin admin

){

Admin db =

repo.findByUsername(
admin.getUsername()
);

if(

db != null

&&

db.getPassword()

.equals(
admin.getPassword()
)

){

return "SUCCESS";

}

return "INVALID";

}




@GetMapping("/all")

public List<Admin> getAll(){

return repo.findAll();

}

}
