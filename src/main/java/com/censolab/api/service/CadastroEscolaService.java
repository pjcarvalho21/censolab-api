package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.censolab.api.model.Escola;
import com.censolab.api.repository.EscolaRepository;

@Service
public class CadastroEscolaService {

	@Autowired
	private EscolaRepository escolaRepository;

	public Escola salvar(Escola escola) {

		return escolaRepository.salvar(escola);

	}

	public void remover(Long id) {

		try {
			escolaRepository.remover(id);
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException();
		}

	}

	public Escola atualizar(Escola escola, Long id) {

		return escolaRepository.salvar(escola);

	}

}
