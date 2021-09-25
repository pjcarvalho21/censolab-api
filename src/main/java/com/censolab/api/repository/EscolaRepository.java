package com.censolab.api.repository;

import java.util.List;

import com.censolab.api.model.Escola;


public interface EscolaRepository {

	List<Escola> listar();

	Escola buscar(Long id);

	Escola salvar(Escola escola);

	void remover(Long id);

}
