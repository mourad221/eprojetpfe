package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idEntreprise")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEntreprise;

    @Column(nullable = false )
    @Size(min =3, max = 45, message = "Le prénom est très court ou très long")
    private String nom;

    @Pattern(regexp = "(^$|[0-9]{10})" )
    private String numeroTel;

    @Column(nullable = false )
    @Size(min =3, max = 45, message = "Le domaine est très court ou très long")
    private String domaineActivite;

    @OneToMany(mappedBy = "entreprise")
    private List<Enseignant> enseignantList;

    @OneToMany(mappedBy = "entreprise")
    private List<Projet> projetList;

    public Integer getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getDomaineActivite() {
        return domaineActivite;
    }

    public void setDomaineActivite(String domaineActivite) {
        this.domaineActivite = domaineActivite;
    }

//    @JsonManagedReference
    public List<Enseignant> getEnseignantList() {
        return enseignantList;
    }

    public void setEnseignantList(List<Enseignant> enseignantList) {
        this.enseignantList = enseignantList;
    }

//    @JsonManagedReference
    public List<Projet> getProjetList() {
        return projetList;
    }

    public void setProjetList(List<Projet> projetList) {
        this.projetList = projetList;
    }
}
