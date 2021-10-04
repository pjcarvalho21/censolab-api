package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.censolab.api.model.auxiliar.UF;
import com.censolab.api.repository.UfRepository;

@RestController
@RequestMapping(value = "/uf", produces = MediaType.APPLICATION_JSON_VALUE)
public class UfController {

	@Autowired
	private UfRepository ufRepository;

	@GetMapping
	public List<UF> listar() {
		return ufRepository.findAll();
	}

}
