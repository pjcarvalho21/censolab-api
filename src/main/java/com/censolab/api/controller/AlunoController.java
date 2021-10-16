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
import com.censolab.api.model.Aluno;
import com.censolab.api.repository.AlunoRepository;
import com.censolab.api.service.AlunoService;

@RestController
@RequestMapping(value = "/alunos", produces = MediaType.APPLICATION_JSON_VALUE)
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AlunoService alunoService;

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Aluno> adicionar(@RequestBody Aluno aluno) {
		Aluno alunoAdd = alunoService.salvar(aluno);
		return ResponseEntity.ok(alunoAdd);

	}

	@PutMapping("/{id}")
	public ResponseEntity<Aluno> atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {

		Optional<Aluno> alunoAtual = alunoRepository.findById(id);
		BeanUtils.copyProperties(aluno, alunoAtual.get(), "id");
		Aluno alunoSalvar = alunoService.salvar(aluno);
		return ResponseEntity.ok(alunoSalvar);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Aluno> buscar(@PathVariable Long id) {

		Optional<Aluno> aluno = alunoRepository.findById(id);
		if (aluno.isPresent()) {
			return ResponseEntity.ok(aluno.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping("/")
	public List<Aluno> listar() {

		return alunoRepository.findAll();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Aluno> remover(@PathVariable Long id) {
		try {
			alunoService.remover(id);
			return ResponseEntity.noContent().build();
		} catch (EntidadeNaoEcontradaException e) {
               return ResponseEntity.notFound().build();
          }catch (EntidadeEmUsoException e) {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
                		}

	}

}
