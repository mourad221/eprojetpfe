package com.groupe.eprojet.services;

import com.groupe.eprojet.models.User;
import com.groupe.eprojet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserByUserName(String username){return userRepository.findUserByUsername(username);}

    public Optional<User> findUserByID(Integer id) {
        return userRepository.findById(id);
    }


    public List<User> findUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
