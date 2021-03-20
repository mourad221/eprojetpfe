package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",insertable = false,updatable = false)
    private int id ;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateComentarire ;
    private String contenu;

    @ManyToOne
    @JoinColumn(name = "projet_id",insertable = false,updatable = false)
    private Projet projet;
    private Integer projet_id;

    @ManyToOne
    @JoinColumn(insertable = false,nullable = false)
    private Enseignant enseignant;

//    @ManyToOne
//    @JoinColumn(name = "id",insertable = false,nullable = false)
//    private User user;
//    private Integer user_id;

    @ManyToOne
    @JoinColumn(insertable = false,updatable = false)
    private Etudiant etudiant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateComentarire() {
        return dateComentarire;
    }

    public void setDateComentarire(Date dateComentarire) {
        this.dateComentarire = dateComentarire;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @JsonBackReference
    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Integer getProjet_id() {
        return projet_id;
    }

    public void setProjet_id(Integer projet_id) {
        this.projet_id = projet_id;
    }

    @JsonBackReference
    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    @JsonBackReference
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
