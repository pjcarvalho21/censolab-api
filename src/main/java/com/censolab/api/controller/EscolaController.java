package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.censolab.api.model.Escola;
import com.censolab.api.repository.EscolaRepository;

@RestController()
@RequestMapping(value = "/v1/escolas", produces = MediaType.APPLICATION_JSON_VALUE)
public class EscolaController {

	@Autowired
	private EscolaRepository escolaRepository;

	@GetMapping
	public List<Escola> listar() {
		return escolaRepository.listar();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Escola adicionar(@RequestBody Escola escola) {

		return null;
	}

	@PutMapping("/{ escolaId }")
	public ResponseEntity<Escola> atualizar(@PathVariable Long escolaId, @RequestBody Escola escola) {
		Escola escolaAtual = escolaRepository.buscar(escolaId);
		BeanUtils.copyProperties(escola, escolaAtual);
		escolaRepository.salvar(escolaAtual);
		return ResponseEntity.ok(escolaAtual);

	}

}
