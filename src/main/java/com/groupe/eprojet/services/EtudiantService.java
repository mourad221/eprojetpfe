package com.groupe.eprojet.services;

import com.groupe.eprojet.models.Etudiant;
import com.groupe.eprojet.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> getEtudiantById(Integer id) {
        return etudiantRepository.findById(id);
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public void updateEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public void deleteEtudiantById(Integer id) {
        etudiantRepository.deleteById(id);
    }


}
