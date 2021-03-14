package com.groupe.eprojet.repositories;

import com.groupe.eprojet.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository  extends JpaRepository<Document,Integer> {
}
