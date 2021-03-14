package com.groupe.eprojet.services;

import com.groupe.eprojet.models.Entreprise;
import com.groupe.eprojet.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseService {

    @Autowired
    EntrepriseRepository entrepriseRepository;

    public Optional<Entreprise> getEntrepriseById(Integer id) {
        return entrepriseRepository.findById(id);
    }



    public void addEntreprise(Entreprise entreprise) {
        entrepriseRepository.save(entreprise);
    }

    public void deleteEntrepriseById(Integer id) {
        entrepriseRepository.deleteById(id);
    }

    public Entreprise getEntrepriseByPhone(String phone) {
        return entrepriseRepository.findByNumeroTel(phone);
    }

    public void updateEntreprise(Entreprise entreprise) {
        entrepriseRepository.save(entreprise);
    }

    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }
}
