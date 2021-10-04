package com.censolab.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.censolab.api.model.Escola;


@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {

}
