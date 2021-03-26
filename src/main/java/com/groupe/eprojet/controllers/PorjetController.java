package com.groupe.eprojet.controllers;

import com.groupe.eprojet.models.Etudiant;
import com.groupe.eprojet.models.Projet;
import com.groupe.eprojet.services.EtudiantService;
import com.groupe.eprojet.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class PorjetController {

    @Autowired
    private ProjetService projetService;

    @Autowired
    private EtudiantService etudiantService;

    //Get all projet
    @GetMapping(value = "/projets/")
    public ResponseEntity getAllProjet(){

        List<Projet> list = projetService.getAllProjet();

        return new ResponseEntity(list, HttpStatus.OK);
    }

    //get a projet by id
    @GetMapping(value = "/projets/{id}")
    public Optional<Projet> getProjetById(@PathVariable Integer id){
        return  projetService.getProjetById(id);
    }

    //add a new projet
    @CrossOrigin(origins="http://localhost:8626")
    @PostMapping(value = "/projets/add")
    public void addProjet(@RequestBody Projet projet){
        projetService.addProjet(projet);
    }

    //update an projet
    @RequestMapping(value = "/projets/update/")
    public void updateProjet(@RequestBody Projet projet){
        projetService.updateProjet(projet);
    }

    //delete an projet
    @DeleteMapping(value = "/projets/delete/{id}")
    public void deleteProjetById(@PathVariable Integer id){
        projetService.deleteProjetById(id);
    }

    @PostMapping(value = "/projets/add-etudiants")
    public Projet addEtudiants(@RequestBody HashMap<String, Object> body){
        int projetId = (int) body.get("projetId");
        ArrayList<Integer> etudiants = (ArrayList<Integer>) body.get("etudiants");

        Projet projet = projetService.getProjetById(projetId).get();
        List<Etudiant> etudiantsList = new ArrayList<>();
        List<Etudiant> previousList = projet.getEtudiants();
        for (int i = 0; i < etudiants.size(); i++) {
            Etudiant etudiant = etudiantService.getEtudiantById(etudiants.get(i)).get();
            if (etudiant != null && !previousList.contains(etudiant) ){
                etudiantsList.add(etudiant);
            }
        }
        previousList.addAll(etudiantsList);
        projet.setEtudiants(previousList);
        projetService.updateProjet(projet);

        return projet;

    }

}
