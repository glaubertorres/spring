package br.org.generation.helloobjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloobjetivos")
public class HelloObjetivosController {
	
	@GetMapping
	public String helloShow() {
		return "Hello Família 36 <p><b>Objetivos da semana: Me organizar!!!!!!!!!!</b>";
	}

}
