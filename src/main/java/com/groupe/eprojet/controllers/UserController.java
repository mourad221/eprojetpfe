package com.groupe.eprojet.controllers;


import com.groupe.eprojet.models.User;
import com.groupe.eprojet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

   @GetMapping(value = "/user/{id}")
    public Optional<User> findUserById(@PathVariable  Integer id){
       return  userService.findUserbyId(id);
   }



}
