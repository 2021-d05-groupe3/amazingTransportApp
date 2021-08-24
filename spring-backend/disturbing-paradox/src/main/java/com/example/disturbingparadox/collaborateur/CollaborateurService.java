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

    public void addCollaborateur(Collaborateur nouveauCollaborateur) {
        collaborateurRepository.save(nouveauCollaborateur);
    }

    public void deleteCollaborateur(Long id) {
        for (Collaborateur c : collaborateurRepository.findAll()) {
            if (id.equals(c.getId()))
                collaborateurRepository.delete(c);
        }

    }
}
