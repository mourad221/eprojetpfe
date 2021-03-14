package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idCategorie")
public class Categorie {

    @Id
    private Integer idCategorie;

    private String domaine;

    @ManyToOne
    @JoinColumn(name ="projet_id" ,insertable=false, updatable=false)
    private Projet projet;
    private Integer projet_id;
}
