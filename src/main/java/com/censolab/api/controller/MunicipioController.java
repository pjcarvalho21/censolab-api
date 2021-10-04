package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.censolab.api.model.auxiliar.Municipio;
import com.censolab.api.repository.MunicipioRepository;

@RestController
@RequestMapping(value = "/municipio", produces = MediaType.APPLICATION_JSON_VALUE)
public class MunicipioController {

	@Autowired
	private MunicipioRepository municipioRespository;
	
    @GetMapping("/{idUf}")
	public List<Municipio> listarPorUf(@PathVariable Long idUf) {
	
		return municipioRespository.findByufId(idUf);
		
	}
	
}
