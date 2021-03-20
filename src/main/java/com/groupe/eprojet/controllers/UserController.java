package com.groupe.eprojet.controllers;


import com.groupe.eprojet.models.User;
import com.groupe.eprojet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

   @GetMapping(value = "/user/{id}")
    public Optional<User> findUserById(@PathVariable  Integer id){
       return  userService.findUserByID(id);
   }
   @GetMapping(value = "/users/")
    public List<User> findUsers(){
       return userService.findUsers();
   }

   @PostMapping(value = "/users/add")
    public void adduser(@RequestBody User user){
       userService.addUser(user);
   }



}
