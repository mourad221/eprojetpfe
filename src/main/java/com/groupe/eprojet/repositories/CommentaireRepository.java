package com.groupe.eprojet.repositories;

import com.groupe.eprojet.models.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository  extends JpaRepository<Commentaire,Integer> {
}
