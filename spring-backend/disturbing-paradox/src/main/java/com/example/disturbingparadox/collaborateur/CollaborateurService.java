package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollaborateurService {

    @Autowired
    CollaborateurRepository collaborateurRepository;

    public List<Collaborateur> getCollaborateur(String name) {

        return collaborateurRepository.findByName(name);
        
    }


}
