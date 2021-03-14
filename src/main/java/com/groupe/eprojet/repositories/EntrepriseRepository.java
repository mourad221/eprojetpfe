package com.groupe.eprojet.repositories;

import com.groupe.eprojet.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise ,Integer > {

    public Entreprise findByNumeroTel(String telephone);

}
