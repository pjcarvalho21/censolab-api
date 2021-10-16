package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Gestor;
import com.censolab.api.repository.GestorRepository;

@Service
public class CadastroGestorService {

	@Autowired
	private GestorRepository gestorRepository;
	public Gestor salvar(Gestor gestor) {
		
		return gestorRepository.save(gestor);
		
	}
	public void remover(Long id) {

		try {
			gestorRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
	              throw new EntidadeNaoEcontradaException(String.format("Não existe um cadastro de Professor com o código %d !", id ) );
	              }
		
	}
	
	
}
