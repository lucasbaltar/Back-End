package com.example.generation.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")
public class bsmController {
	
	@GetMapping
	public String bsm() {
		return "\n1 - Mentalidade de Crescimento"
				+ "\n2 - Persistência"
				+ "\n3 - Responsabilidade Pessoal"
				+ "\n4 - Orientação ao futuro"
				+ "\n5 - Comunicação"
				+ "\n6 - Orientação ao detalhe"
				+ "\n7 - Proatividade";
	}

}
