package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Professor;
import com.censolab.api.repository.ProfessorRepository;

@Service
public class CadastroProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	public Professor salvar(Professor professor) {
	
		return professorRepository.save(professor); 
		
	}
	
	public void remover(Long id) {
		
		try {
			professorRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEcontradaException(
            		String.format("Não existe um cadastro de Professor com o código %d !", id )
            		);
		}
	}
	
}
