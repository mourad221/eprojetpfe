package com.groupe.eprojet.models;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projet")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false,updatable = true)
    private String titre;

    @Column(nullable = false,updatable = true)
    private String sujet;

    @Column(nullable = false,updatable = true)
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDebut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
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

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "etudiant_projets",
            joinColumns = { @JoinColumn(name = "projets_id") },
            inverseJoinColumns = { @JoinColumn(name = "etudiants_id") }
    )
    private List <Etudiant> etudiants ;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }


    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<String> getPreRequis() {
        return preRequis;
    }

    public void setPreRequis(List<String> preRequis) {
        this.preRequis = preRequis;
    }

//    @JsonBackReference
    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

//    @JsonBackReference
    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

//    @JsonManagedReference
    public List<Categorie> getCategorieList() {
        return categorieList;
    }

    public void setCategorieList(List<Categorie> categorieList) {
        this.categorieList = categorieList;
    }

//    @JsonManagedReference
    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

//    @JsonManagedReference
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

//    @JsonManagedReference
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
