package com.censolab.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.censolab.api.model.Gestor;
import com.censolab.api.repository.GestorRepository;

@Service
public class CadastroGestorService {

	@Autowired
	private GestorRepository gestorRepository;
	public Gestor salvar(Gestor gestor) {
		
		return gestorRepository.save(gestor);
		
	}
	
	
}
