package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.censolab.api.model.auxiliar.Municipio;
import com.censolab.api.repository.MunicipioRepository;

@RestController
@RequestMapping(value = "/municipio", produces = MediaType.APPLICATION_JSON_VALUE)
public class MunicipioController {

	@Autowired
	private MunicipioRepository municipioRespository;
	
    @GetMapping("/por-estado")
	public List<Municipio> listarPorUf(@RequestParam Long id) {
	
    	
		return municipioRespository.findByufId(id);
		
	}
	
}
