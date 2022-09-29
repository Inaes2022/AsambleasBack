package org.inaes.av.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.inaes.av.model.Persona;
import org.inaes.av.repository.IPersonaRepository;

@RestController
@RequestMapping("/api-personas")
public class personasController {

	@Autowired
	IPersonaRepository personRepository;
	
	@GetMapping("/registrar")
	public Persona registrarPersona() {
		Persona persona = new Persona();
		persona.setNombre("Carlos");
		persona.setApellidoPaterno("Velazquez");
		persona.setApellidoMaterno("Navarrete");
		persona.setCorreoElectronico("carlosvn.se@gmail.com");
		Persona personaRegistrada = personRepository.save(persona);
		return personaRegistrada;
	}
	

}
