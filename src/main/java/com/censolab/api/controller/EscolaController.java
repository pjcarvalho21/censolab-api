package com.censolab.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.censolab.api.exception.EntidadeEmUsoException;
import com.censolab.api.exception.EntidadeNaoEcontradaException;
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

	@GetMapping("/{escolaId}")
	public ResponseEntity<Escola> buscar(@PathVariable Long escolaId) {
		Optional<Escola> cozinha = escolaRepository.findById(escolaId);

		if (cozinha.isPresent()) {
			return ResponseEntity.ok(cozinha.get());
		}

		return ResponseEntity.notFound().build();
	}

	@GetMapping
	public List<Escola> listar() {
		return escolaRepository.findAll();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Escola> atualizar(@PathVariable Long id, @RequestBody Escola escola) {
		Optional<Escola> escolaAtual = escolaRepository.findById(id);
		BeanUtils.copyProperties(escola, escolaAtual.get(), "id");
		Escola escolaSalva = cadastroEscolaService.salvar(escola);
		return ResponseEntity.ok(escolaSalva);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Escola> remover(@PathVariable Long id) {
		try {

			cadastroEscolaService.remover(id);
			return ResponseEntity.noContent().build();
		} catch (EntidadeNaoEcontradaException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (EntidadeEmUsoException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}

}
