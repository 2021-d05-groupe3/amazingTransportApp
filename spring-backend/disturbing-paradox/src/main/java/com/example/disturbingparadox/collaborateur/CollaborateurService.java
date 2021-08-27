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

    public List<Collaborateur> getCollaborateurs() {
        return collaborateurRepository.findAll();
    }

    public Collaborateur addCollaborateur(CollaborateurDto nouveauCollaborateur) {
        System.out.println(nouveauCollaborateur );
        Collaborateur user = new Collaborateur();
        user.setName(nouveauCollaborateur.name);
        user.setFirstName(nouveauCollaborateur.firstName);
        user.setEmail(nouveauCollaborateur.email);
        return collaborateurRepository.save(user);

       
    }

    public String addCollaborateur(String name, String firstName, String email) {

        Collaborateur user = new Collaborateur();
        user.setName(name);
        user.setFirstName(firstName);
        user.setEmail(email);
        collaborateurRepository.save(user);

        return "collaborateur ajouté";


    }

    public void deleteCollaborateur(Long id) {
        for (Collaborateur c : collaborateurRepository.findAll()) {
            if (id.equals(c.getId()))
                collaborateurRepository.delete(c);
        }

    }
}
