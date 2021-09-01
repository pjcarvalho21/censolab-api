package com.censolab.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.censolab.api.model.Gestor;
import com.censolab.api.repository.GestorRepository;

@Component
public class GestorRepositoryImpl implements GestorRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Gestor> listar() {

		return manager.createQuery("from Gestor", Gestor.class).getResultList();
	}

	@Override
	public Gestor buscar(Long id) {

		return manager.find(Gestor.class, id);
	}

	@Transactional
	@Override
	public Gestor salvar(Gestor gestor) {

		return manager.merge(gestor);
	}

	@Transactional
	@Override
	public void remover(Gestor gestor) {
		gestor = buscar(gestor.getId());
		manager.remove(gestor);

	}

}
