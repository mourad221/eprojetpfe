package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Enseignant   {

    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String faculte;

    @ManyToOne
    private Entreprise entreprise ;

    @OneToMany(mappedBy = "enseignant")
    private List<Projet> projetList;

    @OneToMany(mappedBy = "enseignant")
    private List<Commentaire> commentaireList;

}
