package com.censolab.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/v1/escola", produces = MediaType.APPLICATION_JSON_VALUE)
public class EscolaController {

	@GetMapping("/ola") 
	public String ola() {
		return "ola mundão de Deus!";
	}
	
}
