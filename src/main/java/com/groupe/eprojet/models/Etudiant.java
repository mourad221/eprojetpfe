package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
//lombol annotation
//@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Etudiant {

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
    private String filiere;

    @Column(nullable = false )
    private String niveauEtude;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "etudiants")
    @JsonIgnoreProperties("etudiants")
    private List<Projet> projets;

    @OneToMany(mappedBy = "etudiant")
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

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

//    @JsonBackReference
    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

//    @JsonManagedReference
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }
}


