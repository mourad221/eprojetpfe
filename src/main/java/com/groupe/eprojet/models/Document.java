package com.groupe.eprojet.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idDocument")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_document")
    private Integer idDocument;

    @Column(unique = true,nullable = false)
    @Size(min = 3,max = 25)
    private String titreDocument;
    @Column(nullable =false)
    @Size(min = 3,max = 25)
    private String typeDocument;

    @ManyToOne
    @JoinColumn(name = "projet_id",insertable = false,updatable = false)
    private Projet projet;
    private Integer projet_id;

    public Integer getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public String getTitreDocument() {
        return titreDocument;
    }

    public void setTitreDocument(String titreDocument) {
        this.titreDocument = titreDocument;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

//    @JsonBackReference
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
}
