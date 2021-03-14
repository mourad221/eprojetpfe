package com.groupe.eprojet.repositories;

import com.groupe.eprojet.models.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository  extends JpaRepository<Projet,Integer> {
}
