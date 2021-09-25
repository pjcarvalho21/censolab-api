package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.censolab.api.service.CadastroEscolaService;

@RestController
@RequestMapping(value = "/escolas", produces = MediaType.APPLICATION_JSON_VALUE)
public class EscolaController {

	@Autowired
	private EscolaRepository escolaRepository;

	@Autowired
	private CadastroEscolaService cadastroEscolaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Escola adicionar(@RequestBody Escola escola) {

		return cadastroEscolaService.salvar(escola);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Escola> buscar(@PathVariable Long id) {

		Escola escola = escolaRepository.buscar(id);
		if (escola != null) {
			return ResponseEntity.ok(escola);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping
	public List<Escola> listar() {
		return escolaRepository.listar();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Escola> atualizar(@PathVariable Long id, @RequestBody Escola escola) {
		Escola escolaAtual = escolaRepository.buscar(id);
		BeanUtils.copyProperties(escola, escolaAtual, "id");
		escolaRepository.salvar(escolaAtual);
		return ResponseEntity.ok(escolaAtual);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Escola> remover(@PathVariable Long id) {
		try {
			Escola escola = escolaRepository.buscar(id);
			if (escola != null) {
			escolaRepository.remover(id);
			return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.notFound().build();
		}catch (DataIntegrityViolationException  e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		
	}

}
