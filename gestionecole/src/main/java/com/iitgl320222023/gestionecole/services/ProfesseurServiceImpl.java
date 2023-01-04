package com.iitgl320222023.gestionecole.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iitgl320222023.gestionecole.Repositories.ProfesseurRepository;
import com.iitgl320222023.gestionecole.models.Professeur;


@Service
public class ProfesseurServiceImpl implements ProfesseurService {
	
	@Autowired
	ProfesseurRepository professeurRepository;
	
	@Override
	public Professeur save (Professeur professeur) {
		return this.professeurRepository.save(professeur);
	}
	@Override
	public List <Professeur> getAll(){
		return this.professeurRepository.findAll();
	}
	@Override
	public void deleteById (Long id) {
		this.professeurRepository.deleteById(id);
		
	}
	//public Article getOne(Long id) {
	//	return articleRepository.findById(id).orElse(null);
	//}
	@Override
	public Optional <Professeur > getOne(Long id) {
		return this.professeurRepository.findById(id);
	}
	
	@Override
	public Professeur update(Professeur professeur) {
		// TODO Auto-generated method stub
		return null;
	}

}
