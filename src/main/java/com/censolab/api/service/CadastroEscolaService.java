package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.censolab.api.exception.EntidadeEmUsoException;
import com.censolab.api.exception.EntidadeNaoEcontradaException;
import com.censolab.api.model.Escola;
import com.censolab.api.repository.EscolaRepository;

@Service
public class CadastroEscolaService {

	@Autowired
	private EscolaRepository escolaRepository;

	public Escola salvar(Escola escola) {

		return escolaRepository.save(escola);

	}

	public void remover(Long id) {

		try {
			escolaRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEcontradaException(
					String.format("Não existe um cadastro de Escola com o código %d !", id ));
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Escola com o código %d não pode ser removida. Código em uso!", id));
		}

	}

}
