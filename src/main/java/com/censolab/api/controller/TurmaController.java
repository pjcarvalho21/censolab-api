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

import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Turma;
import com.censolab.api.repository.TurmaRepository;
import com.censolab.api.service.CadastroTurmaService;

@RestController
@RequestMapping(value="/turmas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TurmaController {
	@Autowired
	private TurmaRepository turmaRepository;
	@Autowired
	private CadastroTurmaService turmaService;
	
	
	@GetMapping("/")
	public List<Turma> listar() {
		return turmaRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Turma> buscar(@PathVariable Long id) {

		Optional<Turma> Turma = turmaRepository.findById(id);

		if (Turma.isPresent()) {
			return ResponseEntity.ok(Turma.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Turma> adicionar(@RequestBody Turma Turma) {

		Turma novoTurma = turmaService.salvar(Turma);
		return ResponseEntity.ok(novoTurma);

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Turma> atualizar(@PathVariable Long id, @RequestBody Turma Turma){
		       
		Optional<Turma> TurmaAtual = turmaRepository.findById(id);
		BeanUtils.copyProperties(Turma, TurmaAtual, "id");
		   Turma TurmaSalvar =   turmaRepository.save(Turma);
		     
		return ResponseEntity.ok(TurmaSalvar);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Turma> remover(@PathVariable Long id){
		
		try {
	        turmaService.remover(id);
	        return ResponseEntity.noContent().build();			
		} catch (EntidadeNaoEcontradaException e) {
                  return ResponseEntity.notFound().build();
		}

		        
		
	}
	
	
	
	
	
}
