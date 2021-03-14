package com.groupe.eprojet.repositories;

import com.groupe.eprojet.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,Integer> {
}
