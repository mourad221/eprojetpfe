package com.groupe.eprojet.controllers;


import com.groupe.eprojet.models.Categorie;
import com.groupe.eprojet.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    //Get all categorie
    @GetMapping(value = "/categories/")
    public List<Categorie> getAllCategorie(){
        return categorieService.getAllCategorie();
    }

    //get a categorie by id
    @GetMapping(value = "/categories/{id}")
    public Optional<Categorie> getCategorieById(@PathVariable Integer id){
        return  categorieService.getCategorieById(id);
    }

    //add a new categorie
    @PostMapping(value = "/categories/add")
    public void addCategorie(@RequestBody Categorie categorie){
        categorieService.addCategorie(categorie);
    }

    //update a categorie
    @RequestMapping(value = "/categories/update/")
    public void updateCategorie(@RequestBody Categorie categorie){
        categorieService.updateCategorie(categorie);
    }

    //delete an categorie
    @DeleteMapping(value = "/categories/delete/{id}")
    public void deleteCategorieById(@PathVariable Integer id){
        categorieService.deleteCategorieById(id);
    }
}
