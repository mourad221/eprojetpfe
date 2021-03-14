package com.groupe.eprojet.controllers;

import com.groupe.eprojet.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentaireController {

    @Autowired
    private CommentaireService commentaireService;
}
