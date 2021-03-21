package com.groupe.eprojet.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(unique = true,nullable = false)
    private String username;
    private String password;
    @Email(regexp = "^[A-Za-z0-9+_.-]+@(.+)$",message = "Le mail doit etre valide ")
    private String mail;

//    @OneToMany(mappedBy = "user")
//    List<Commentaire> commentaires;

}
