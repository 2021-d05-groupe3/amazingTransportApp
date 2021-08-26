package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

        List<Collaborateur> collaborateurs = collaborateurService.getCollaborateur(name);
        
        return collaborateurs;
        
    }

    @GetMapping("/afficherCollaborateur")
	public List<Collaborateur> afficherLesCollaborateurs(){
		return collaborateurService.getCollaborateurs();
	}

	@PostMapping("/ajouterCollaborateur")
	public Collaborateur ajouterCollaborateur(@RequestBody CollaborateurDto collaborateur) {
		System.out.println(collaborateur);
		return collaborateurService.addCollaborateur(collaborateur);
	}

	@PostMapping("/collaborateur")
	public ResponseEntity<Collaborateur> add(@RequestBody CollaborateurDto dto) {
		System.out.println(dto);
		Collaborateur collaborateur =  collaborateurService.addCollaborateur(dto);
		if(collaborateur == null){
			return new 	ResponseEntity<Collaborateur>(collaborateur,HttpStatus.BAD_REQUEST );
		}
		return new 	ResponseEntity<Collaborateur>(collaborateur,HttpStatus.OK );
	}

	@DeleteMapping("/suprimerCollaborateur/{id}")  	
	public String supprimerCollaborateur(@PathVariable("id") Long id) {
		collaborateurService.deleteCollaborateur(id);
	     return"supression ok";
	}
    
}
