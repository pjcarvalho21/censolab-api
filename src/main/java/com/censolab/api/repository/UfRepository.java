package com.censolab.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.censolab.api.model.auxiliar.UF;

public interface UfRepository extends JpaRepository<UF, Long> {

	public UF findByCodigo(Long codigo);
}
