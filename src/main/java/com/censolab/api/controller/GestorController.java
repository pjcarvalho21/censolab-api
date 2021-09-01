package com.censolab.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.censolab.api.model.Gestor;
import com.censolab.api.repository.GestorRepository;

@RestController
@RequestMapping(value = "/gestores")
public class GestorController {

	@Autowired
	private GestorRepository gestorRepository;

	@GetMapping
	public List<Gestor> listar() {
		return gestorRepository.listar();
	}

	@GetMapping("/{gestorId}")
	public ResponseEntity<Gestor> buscar(@PathVariable Long gestorId) {

		Gestor gestor = gestorRepository.buscar(gestorId);
		if (gestor != null) {
			return ResponseEntity.ok(gestor);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Gestor adicionar(@RequestBody Gestor gestor) {

		return gestorRepository.salvar(gestor);
	}

	@PutMapping("/{ id }")
	public ResponseEntity<Gestor> atualizar(@PathVariable Long id, @RequestBody Gestor gestor) {
		Gestor gestorAtual = gestorRepository.buscar(id);
		BeanUtils.copyProperties(gestor, gestorAtual);
		gestorRepository.salvar(gestorAtual);
		return ResponseEntity.ok(gestorAtual);

	}

}
