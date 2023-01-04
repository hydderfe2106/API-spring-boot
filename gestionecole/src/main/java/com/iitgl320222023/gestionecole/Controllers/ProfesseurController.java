package com.iitgl320222023.gestionecole.Controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.iitgl320222023.gestionecole.models.Professeur;
import com.iitgl320222023.gestionecole.services.ProfesseurService;


@RestController
@RequestMapping("/professeur")

public class ProfesseurController {
	
public ProfesseurService professeurService;
	
	
	@RequestMapping(value="/add",method = RequestMethod.POST,headers="accept=Application/json")
	public Professeur save(@RequestBody Professeur professeur) {
		
		try {
			professeur= this.professeurService.save(professeur);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return professeur;
		
	}
	
	@RequestMapping(value="/getAll",method = RequestMethod.GET,headers="accept=Application/json")
	public List<Professeur> getAll() {
		
		List<Professeur> professeurs = new ArrayList<>();
		
		try {
			professeurs = this.professeurService.getAll();
		}catch(Exception e) {
			System.out.println(e);
		}
		return professeurs;
		
	}
	
}
