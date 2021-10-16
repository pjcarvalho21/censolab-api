package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.censolab.api.exception.EntidadeEmUsoException;
import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Aluno;
import com.censolab.api.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRespository;
	
	public Aluno salvar(Aluno aluno) {
		
		return alunoRespository.save(aluno);
	}
	
	
	public void remover(Long id) {
		
		try {
			alunoRespository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
		  throw new EntidadeNaoEcontradaException(String.format("Não existe aluno com o código informado:", id));	
		}catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Aluno com o código %d não pode ser removida. Código em uso!", id));
		}
		
	}
	
}
