package com.groupe.eprojet.controllers;


import com.groupe.eprojet.models.Document;
import com.groupe.eprojet.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    //Get all document
    @GetMapping(value = "/documents/")
    public List<Document> getAllDocument(){
        return documentService.getAllDocument();
    }

    //get an document by id
    @GetMapping(value = "/documents/{id}")
    public Optional<Document> getDocumentById(@PathVariable Integer id){
        return  documentService.getDocumentById(id);
    }

    //add a new document
    @PostMapping(value = "/documents/add")
    public void addDocument(@RequestBody Document document){
        documentService.addDocument(document);
    }

    //update an document
    @RequestMapping(value = "/documents/update/")
    public void updateDocument(@RequestBody Document document){
        documentService.updateDocument(document);
    }

    //delete an document
    @DeleteMapping(value = "/documents/delete/{id}")
    public void deleteDocumentById(@PathVariable Integer id){
        documentService.deleteDocumentById(id);
    }
    
    
}
