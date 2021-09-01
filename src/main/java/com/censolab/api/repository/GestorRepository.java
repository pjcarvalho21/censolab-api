package com.censolab.api.repository;

import java.util.List;
import com.censolab.api.model.Gestor;


public interface GestorRepository {

	List<Gestor> listar();

	Gestor buscar(Long id);

	Gestor salvar(Gestor gestor);

	void remover(Gestor gestor);

}
