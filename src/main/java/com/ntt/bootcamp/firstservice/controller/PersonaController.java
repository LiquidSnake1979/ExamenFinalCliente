package com.ntt.bootcamp.firstservice.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ntt.bootcamp.firstservice.model.Persona;

@RestController
public class PersonaController {
	RestTemplate restTemplate = new RestTemplate();


	public String setName(String name) {
		String url = "http://localhost:8888/setName";
		String requestJson = name;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
		String respuesta = restTemplate.postForObject(url, entity, String.class);
		return respuesta;

	}

	public String setApellidos(String apellidos) {
		String url = "http://localhost:8888/setApellidos";
		String requestJson = apellidos;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
		String respuesta = restTemplate.postForObject(url, entity, String.class);
		return respuesta;

	}
	
	public String setEdad(Integer edad) {
		String url = "http://localhost:8888/setEdad";
		Integer requestJson = edad;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(requestJson.toString(), headers);
		String respuesta = restTemplate.postForObject(url, entity, String.class);
		return respuesta;
	}
	
	public Persona getPersona() {
		String fooResourceUrl = "http://localhost:8888/getPersona";
		ResponseEntity<Persona> response = restTemplate.getForEntity(fooResourceUrl, Persona.class);
		return response.getBody();
	}
}