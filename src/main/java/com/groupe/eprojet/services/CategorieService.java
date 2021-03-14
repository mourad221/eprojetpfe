package com.groupe.eprojet.services;


import com.groupe.eprojet.models.Categorie;
import com.groupe.eprojet.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }

    public Optional<Categorie> getCategorieById(Integer id) {
        return categorieRepository.findById(id);
    }

    public void addCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public void updateCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public void deleteCategorieById(Integer id) {
        categorieRepository.deleteById(id);
    }
}
