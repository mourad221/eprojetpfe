package com.groupe.eprojet.services;

import com.groupe.eprojet.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;
}
