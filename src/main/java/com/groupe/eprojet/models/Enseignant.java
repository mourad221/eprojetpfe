package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.StackManipulation;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Enseignant   {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false )
    @Size(min =3, max = 45, message = "Le nom est très court")
    private String nom;

    @Column(nullable = false )
    @Size(min =3, max = 45, message = "Le prénom est très court")
    private String prenom;

    @Column(nullable = false )
    @Size(min =3, max = 45, message = "Le nom de faculté")
    private String faculte;

    @ManyToOne
    private Entreprise entreprise ;

    @OneToMany(mappedBy = "enseignant")
    @JsonIgnoreProperties("enseignant")
    private List<Projet> projetList;

    @OneToMany(mappedBy = "enseignant")
    private List<Commentaire> commentaireList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }

//    @JsonBackReference
    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

//    @JsonManagedReference
    public List<Projet> getProjetList() {
        return projetList;
    }

    public void setProjetList(List<Projet> projetList) {
        this.projetList = projetList;
    }

//    @JsonManagedReference
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }
}
