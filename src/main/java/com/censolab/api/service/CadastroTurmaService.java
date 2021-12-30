package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Turma;
import com.censolab.api.repository.TurmaRepository;

@Service
public class CadastroTurmaService {

	@Autowired
	private TurmaRepository turmaRepository;
	
	public Turma salvar(Turma turma) {
	
		return turmaRepository.save(turma); 
		
	}
	
	public void remover(Long id) {
		
		try {
			turmaRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEcontradaException(
            		String.format("Não existe um cadastro de Turma com o código %d !", id )
            		);
		}
	}
	
}
