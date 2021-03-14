package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Etudiant {

    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String filiere;
    private String niveauEtude;

    @ManyToMany
    private List<Projet> projets;

    @OneToMany(mappedBy = "etudiant")
    private List<Commentaire> commentaireList;


}


