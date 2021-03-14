package com.groupe.eprojet.controllers;


import com.groupe.eprojet.models.Entreprise;
import com.groupe.eprojet.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntrepriseController {

    @Autowired
    EntrepriseService entrepriseService;

    //Get all entreprise
    @GetMapping(value = "/entreprises/")
    public List<Entreprise> getAllEntreprise(){
        return entrepriseService.getAllEntreprise();
    }

    //get an entreprise by id
    @GetMapping(value = "/entreprises/{id}")
    public Optional<Entreprise> getEntrepriseById(@PathVariable  Integer id){
        return  entrepriseService.getEntrepriseById(id);
    }

    //add a new entreprise
    @PostMapping(value = "/entreprises/add")
    public void addEntreprise(@RequestBody Entreprise entreprise){
        entrepriseService.addEntreprise(entreprise);
    }

    //update an entreprise
    @RequestMapping(value = "/entreprises/update/")
    public void updateEntreprise(@RequestBody Entreprise entreprise){
        entrepriseService.updateEntreprise(entreprise);
    }

    //delete an entreprise
    @DeleteMapping(value = "/entreprises/delete/{id}")
    public void deleteEntrepriseById(@PathVariable Integer id){
        entrepriseService.deleteEntrepriseById(id);
    }

    //get an entreprise by phone number
    @GetMapping(value = "/entreprises/getbyphone/{phone}")
    public Entreprise getEntrepriseByPhone(@PathVariable String phone){
        return entrepriseService.getEntrepriseByPhone(phone);
    }


}
