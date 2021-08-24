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

    public List<Collaborateur> findAllCollaborateurs() {

        return collaborateurRepository.findAll();

    }

    public String addCollaborateur(String name, String firstName, String email) {

        Collaborateur user = new Collaborateur();
        user.setName(name);
        user.setFirstName(firstName);
        user.setEmail(email);
        collaborateurRepository.save(user);

        return "collaborateur ajouté";


    }


}
