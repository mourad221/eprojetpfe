package com.groupe.eprojet.services;

import com.groupe.eprojet.models.User;
import com.groupe.eprojet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> findUserbyId(Integer id) {
        return userRepository.findById(id);
    }
}
