package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

    @GetMapping("/collaborateur/{name}")
    public List<Collaborateur> getCollaborateur(@PathVariable String name) {

        return collaborateurService.getCollaborateur(name);        
        
    }

    @GetMapping("/collaborateur")
	public List<Collaborateur> afficherLesCollaborateurs(){
		return collaborateurService.getCollaborateurs();
	}

	@PostMapping("/collaborateur")
	public Collaborateur ajouterCollaborateur(@RequestBody CollaborateurDto collaborateur) {
		System.out.println(collaborateur);
		return collaborateurService.addCollaborateur(collaborateur);
	}



	@DeleteMapping("/Collaborateur/{id}")  	
	public String supprimerCollaborateur(@PathVariable("id") Long id) {
		collaborateurService.deleteCollaborateur(id);
	     return"supression ok";
	}
    
}
