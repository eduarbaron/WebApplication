package com.projects.webaplication.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.webaplication.models.Persona;

public interface IPersonaRespository extends JpaRepository<Persona, Long> {

}
