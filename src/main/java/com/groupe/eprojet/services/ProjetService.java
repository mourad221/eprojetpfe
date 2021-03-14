package com.groupe.eprojet.services;

import com.groupe.eprojet.models.Projet;
import com.groupe.eprojet.repositories.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> getAllProjet() {
        return projetRepository.findAll();
    }

    public Optional<Projet> getProjetById(Integer id) {
        return projetRepository.findById(id);
    }

    public void addProjet(Projet projet) {
        projetRepository.save(projet);
    }

    public void updateProjet(Projet projet) {
        projetRepository.save(projet);
    }

    public void deleteProjetById(Integer id) {
        projetRepository.deleteById(id);
    }
}
