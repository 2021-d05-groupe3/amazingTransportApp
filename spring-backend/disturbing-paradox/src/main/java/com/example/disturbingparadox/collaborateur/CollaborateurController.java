package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

    @GetMapping("/collaborateur/{name}")
    public List<Collaborateur> getCollaborateur(@PathVariable String name) {

        List<Collaborateur> collaborateurs = collaborateurService.getCollaborateur(name);
        
        return collaborateurs;
        
    }
}
