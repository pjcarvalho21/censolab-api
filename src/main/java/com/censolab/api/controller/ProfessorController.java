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
import com.censolab.api.model.Professor;
import com.censolab.api.repository.ProfessorRepository;
import com.censolab.api.service.CadastroProfessorService;

@RestController
@RequestMapping(value = "/professores", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;
	@Autowired
	private CadastroProfessorService professorService;

	@GetMapping("/")
	public List<Professor> listar() {
		return professorRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Professor> buscar(@PathVariable Long id) {

		Optional<Professor> professor = professorRepository.findById(id);

		if (professor.isPresent()) {
			return ResponseEntity.ok(professor.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Professor> adicionar(@RequestBody Professor professor) {

		Professor novoProfessor = professorService.salvar(professor);
		return ResponseEntity.ok(novoProfessor);

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Professor> atualizar(@PathVariable Long id, @RequestBody Professor professor){
		       
		Optional<Professor> professorAtual = professorRepository.findById(id);
		BeanUtils.copyProperties(professor, professorAtual, "id");
		   Professor professorSalvar =   professorRepository.save(professor);
		     
		return ResponseEntity.ok(professorSalvar);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Professor> remover(@PathVariable Long id){
		
		try {
	        professorService.remover(id);
	        return ResponseEntity.noContent().build();			
		} catch (EntidadeNaoEcontradaException e) {
                  return ResponseEntity.notFound().build();
		}

		        
		
	}

}
