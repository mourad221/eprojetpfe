package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"hibernateLazyInitialize","handler","enseignantList"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idEntreprise")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEntreprise;
    private String nom;
    private String numeroTel;
    private String domaineActivite;

    @OneToMany(mappedBy = "entreprise")
    private List<Enseignant> enseignantList;

    @OneToMany(mappedBy = "entreprise")
    private List<Projet> projetList;


}
