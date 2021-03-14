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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idDocument")
public class Document {

    @Id
    @Column(name = "id_document")
    private Integer idDocument;

    private String titreDocument;
    private String typeDocument;

    @ManyToOne
    @JoinColumn(name = "projet_id",insertable = false,updatable = false)
    private Projet projet;
    private Integer projet_id;

}
