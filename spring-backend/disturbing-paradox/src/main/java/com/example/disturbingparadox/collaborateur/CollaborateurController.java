package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

    @GetMapping("/collaborateur/{name}")
    public List<Collaborateur> getCollaborateur(@PathVariable String name) {

        List<Collaborateur> collaborateurs = collaborateurService.getCollaborateur(name);
        
        return collaborateurs;
        
    }

    @GetMapping("/afficherCollaborateur")
	public List<Collaborateur> afficherLesCollaborateurs(){
		return collaborateurService.getCollaborateurs();
	}

	@PostMapping("/ajouterCollaborateur")
	public void ajouterCollaborateur(Collaborateur collaborateur) {
		collaborateurService.addCollaborateur(collaborateur);
	}

	@DeleteMapping("/suprimerCollaborateur/{id}")  	
	public String supprimerCollaborateur(@PathVariable("id") Long id) {
		collaborateurService.deleteCollaborateur(id);
	     return"supression ok";
	}
    
}
