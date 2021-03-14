package com.groupe.eprojet.controllers;

import com.groupe.eprojet.models.Etudiant;
import com.groupe.eprojet.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    //Get all etudiant
    @GetMapping(value = "/etudiants/")
    public List<Etudiant> getAllEtudiant(){
        return etudiantService.getAllEtudiant();
    }

    //get an etudiant by id
    @GetMapping(value = "/etudiants/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable Integer id){
        return  etudiantService.getEtudiantById(id);
    }

    //add a new etudiant
    @PostMapping(value = "/etudiants/add")
    public void addEtudiant(@RequestBody Etudiant etudiant){
        etudiantService.addEtudiant(etudiant);
    }

    //update an etudiant
    @RequestMapping(value = "/etudiants/update/")
    public void updateEtudiant(@RequestBody Etudiant etudiant){
        etudiantService.updateEtudiant(etudiant);
    }

    //delete an etudiant
    @DeleteMapping(value = "/etudiants/delete/{id}")
    public void deleteEtudiantById(@PathVariable Integer id){
        etudiantService.deleteEtudiantById(id);
    }


}
