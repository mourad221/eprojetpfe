package com.groupe.eprojet.services;

import com.groupe.eprojet.models.Document;
import com.groupe.eprojet.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> getAllDocument() {
        return documentRepository.findAll();
    }

    public Optional<Document> getDocumentById(Integer id) {
        return documentRepository.findById(id);
    }

    public void addDocument(Document document) {
        documentRepository.save(document);
    }

    public void updateDocument(Document document) {
        documentRepository.save(document);
    }

    public void deleteDocumentById(Integer id) {
        documentRepository.deleteById(id);
    }
}
