package com.projects.webaplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.projects.webaplication.commons.impl.GenericServiceImpl;
import com.projects.webaplication.models.Persona;
import com.projects.webaplication.respository.IPersonaRespository;
import com.projects.webaplication.service.IPersonaService;

@Service
public class PersonaSerivceImpl extends GenericServiceImpl<Persona, Long> implements IPersonaService {

	@Autowired
	private IPersonaRespository personaRepo;
	
	@Override
	public JpaRepository<Persona, Long> getRepo() {
		return personaRepo;
	}


}
