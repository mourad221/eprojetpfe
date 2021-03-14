package com.groupe.eprojet.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projet")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false,updatable = true)
    private String titre;

    @Column(nullable = false,updatable = true)
    private String description;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateDebut;

    @DateTimeFormat(pattern = "yyyy,mm,dd")
    private Date dateFin;

    @ElementCollection
    private List<String> keywords;

    @ElementCollection
    private List<String> preRequis;
    
    @ManyToOne
    @JoinColumn(name = "enseignant_id",insertable = false,updatable = false)
    private Enseignant enseignant;

    @ManyToOne
    @JoinColumn(name = "entreprise_id_entreprise",insertable = false,updatable = false)
    private Entreprise entreprise;


    @OneToMany(mappedBy = "projet")
    private List<Categorie> categorieList;


    @OneToMany(mappedBy = "projet")
    private List<Document> documentList;

    @OneToMany(mappedBy ="projet" ,cascade = CascadeType.ALL)
    private List<Commentaire> commentaireList;

    @ManyToMany(mappedBy = "projets")
    private List <Etudiant> etudiants ;

}
