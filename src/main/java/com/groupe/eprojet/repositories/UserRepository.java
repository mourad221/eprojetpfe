package com.groupe.eprojet.repositories;


import com.groupe.eprojet.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findUserByEmail(String email);

}
