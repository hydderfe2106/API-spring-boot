package com.iitgl320222023.gestionecole.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iitgl320222023.gestionecole.models.Professeur;


@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
	

}
