package com.groupe.eprojet.controllers;

import com.groupe.eprojet.models.Enseignant;
import com.groupe.eprojet.models.Enseignant;
import com.groupe.eprojet.services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnseignantController {

    @Autowired
    private  EnseignantService enseignantService;

    //Get all enseignant
    @GetMapping(value = "/enseignants/")
    public List<Enseignant> getAllEnseignant(){
        return enseignantService.getAllEnseignant();
    }

    //get an enseignant by id
    @GetMapping(value = "/enseignants/{id}")
    public Optional<Enseignant> getEnseignantById(@PathVariable Integer id){
        return  enseignantService.getEnseignantById(id);
    }

    //add a new enseignant
    @PostMapping(value = "/enseignants/add")
    public void addEnseignant(@RequestBody Enseignant enseignant){
        enseignantService.addEnseignant(enseignant);
    }

    //update an enseignant
    @RequestMapping(value = "/enseignants/update/")
    public void updateEnseignant(@RequestBody Enseignant enseignant){
        enseignantService.updateEnseignant(enseignant);
    }

    //delete an enseignant
    @DeleteMapping(value = "/enseignants/delete/{id}")
    public void deleteEnseignantById(@PathVariable Integer id){
        enseignantService.deleteEnseignantById(id);
    }

}
