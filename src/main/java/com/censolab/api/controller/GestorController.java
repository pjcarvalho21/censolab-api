package com.censolab.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.censolab.api.model.Gestor;
import com.censolab.api.repository.GestorRepository;
import com.censolab.api.service.CadastroGestorService;

@RestController
@RequestMapping(value = "/gestores")
public class GestorController {

	@Autowired
	private GestorRepository gestorRepository;

	@Autowired
	private CadastroGestorService gestorService;

	@GetMapping
	public List<Gestor> listar() {
		return gestorRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Gestor> buscar(@PathVariable Long id) {

		Optional<Gestor> gestor = gestorRepository.findById(id);
		if (gestor.isPresent()) {
			return ResponseEntity.ok(gestor.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Gestor adicionar(@RequestBody Gestor gestor) {

		return gestorService.salvar(gestor);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Gestor> atualizar(@PathVariable Long id, @RequestBody Gestor gestor) {
		Optional<Gestor> gestorAtual = gestorRepository.findById(id);
		BeanUtils.copyProperties(gestor, gestorAtual.get(),"id");

		Gestor gestorSalvar = gestorService.salvar(gestor);
		return ResponseEntity.ok(gestorSalvar);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Gestor> remover(@PathVariable Long id){
		try {
			  gestorService.remover(id);
			  return ResponseEntity.noContent().build();
		} catch (EntidadeEmUsoException e) {
                return ResponseEntity.notFound().build();
		}

		
		
	}

}
