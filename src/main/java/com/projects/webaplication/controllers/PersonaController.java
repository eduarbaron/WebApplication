package com.projects.webaplication.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.projects.webaplication.models.Persona;
import com.projects.webaplication.service.IPersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/")
	public String allPersons(Model model) {
		model.addAttribute("list", personaService.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}") 
	public String showSave(Model model, @PathVariable("id") Long id) {	
		if (id != null && id != -1) {
			model.addAttribute("persona", personaService.getPersona(id));	
		}else {
			model.addAttribute("persona", new Persona());	
		}			
		return "save";		
	}
	
	@PostMapping("/save")
	public String save(Persona persona) {
		personaService.save(persona);
		return "redirect:/";		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		personaService.delete(id);
		return "redirect:/";
	}

}
