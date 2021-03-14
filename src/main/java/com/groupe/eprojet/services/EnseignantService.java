package com.groupe.eprojet.services;


import com.groupe.eprojet.models.Enseignant;
import com.groupe.eprojet.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;


    public Optional<Enseignant> getEnseignantById(Integer id) {
        return enseignantRepository.findById(id);
    }

    public void addEnseignant(Enseignant enseignant) {
        enseignantRepository.save(enseignant);
    }

    public void updateEnseignant(Enseignant enseignant) {
        enseignantRepository.save(enseignant);
    }

    public void deleteEnseignantById(Integer id) {
        enseignantRepository.deleteById(id);
    }

    public List<Enseignant> getAllEnseignant() {
        return enseignantRepository.findAll();
    }
}
