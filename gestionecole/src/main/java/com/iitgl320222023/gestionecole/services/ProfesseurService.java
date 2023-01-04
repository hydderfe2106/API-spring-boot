package com.iitgl320222023.gestionecole.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iitgl320222023.gestionecole.models.Professeur;


@Service
public interface ProfesseurService {
	
public Professeur save (Professeur professeur);
	
	public List<Professeur> getAll();
	
	public Optional <Professeur > getOne(Long id);
	
	public Professeur update(Professeur professeur);
	
	public void deleteById (Long id);
	
	
}
