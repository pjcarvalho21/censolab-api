package com.censolab.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.censolab.api.model.auxiliar.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Long>{
	
	public List<Municipio> findByufId(Long idUf);
}
