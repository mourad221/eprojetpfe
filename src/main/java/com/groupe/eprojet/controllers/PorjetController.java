package com.groupe.eprojet.controllers;

import com.groupe.eprojet.models.Projet;
import com.groupe.eprojet.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PorjetController {

    @Autowired
    private ProjetService projetService;

    //Get all projet
    @GetMapping(value = "/projets/")
    public List<Projet> getAllProjet(){
        return projetService.getAllProjet();
    }

    //get a projet by id
    @GetMapping(value = "/projets/{id}")
    public Optional<Projet> getProjetById(@PathVariable Integer id){
        return  projetService.getProjetById(id);
    }

    //add a new projet
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
}
