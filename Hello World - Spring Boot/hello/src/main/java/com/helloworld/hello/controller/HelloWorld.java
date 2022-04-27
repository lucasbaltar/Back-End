package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tornar um controle
@RequestMapping ("/helloworld") //Mapeia o caminho da requisição
public class HelloWorld {
	
	@GetMapping //O que a requisição vai puxar.
	public String hello() {
		return "Hello World!";
	}

	
}
