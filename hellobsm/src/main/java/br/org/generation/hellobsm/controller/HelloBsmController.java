package br.org.generation.hellobsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellobsm")
public class HelloBsmController {
	
	@GetMapping
	public String helloShow() {
		return "Hello Família 36 <p><b>Habilidades e mentalidades: Persistência e trabalho em equipe</b>";
	}

}
