package com.example.lucas.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class objetivosLucas {
	
	@GetMapping
	public String objetivos() {
		return "\n 1 - Aprender mais sobre Spring boot"
				+ "\n 2 - Revisar alguns tópicos de Java"
				+ "\n3 - Revisar e aprender mais sobre banco de dados";
		
	}
	


}
