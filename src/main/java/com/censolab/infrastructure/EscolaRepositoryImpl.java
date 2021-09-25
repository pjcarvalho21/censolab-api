package com.censolab.infrastructure;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.censolab.api.model.Escola;
import com.censolab.api.repository.EscolaRepository;

@Component
public class EscolaRepositoryImpl implements EscolaRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Escola> listar() {

		return manager.createQuery("from Escola", Escola.class).getResultList();
	}

	@Override
	public Escola buscar(Long id) {

		return manager.find(Escola.class, id);
	}

	@Transactional
	@Override
	public Escola salvar(Escola escola) {

		return manager.merge(escola);
	}

	@Transactional
	@Override
	public void remover(Long id) {

		Escola escola = buscar(id);
		if (escola == null) {
			throw new EmptyResultDataAccessException(1);
		}

		manager.remove(escola);

	}

}
