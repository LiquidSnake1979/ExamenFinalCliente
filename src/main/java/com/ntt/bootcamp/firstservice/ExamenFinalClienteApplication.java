package com.ntt.bootcamp.firstservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ntt.bootcamp.firstservice.controller.PersonaController;

@SpringBootApplication
public class ExamenFinalClienteApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonaController personaController = new PersonaController();
		personaController.setName("Manuel");
		personaController.setApellidos("Gonzalez Ruiz");
		personaController.setEdad(34);
		System.out.println(personaController.getPersona().getNombre());
		System.out.println(personaController.getPersona().getApellidos());
		System.out.println(personaController.getPersona().getEdad());
		
		
		
	}

}
