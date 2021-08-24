package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

    @GetMapping("/collaborateur/{name}")
    public List<Collaborateur> getCollaborateur(@PathVariable String name) {

        List<Collaborateur> collaborateur = collaborateurService.getCollaborateur(name);
        
        return collaborateur;
        
    }

    @GetMapping("/collaborateurs")
    public List<Collaborateur> findAllCollaborateurs() {

        List<Collaborateur> collaborateurs = collaborateurService.findAllCollaborateurs();

        return collaborateurs;
        
    }

    @PostMapping("/collaborateur/add")
    public void addCollaborateur(String name, String firstName, String email) {
        
        collaborateurService.addCollaborateur(name, firstName, email);

    }
}
