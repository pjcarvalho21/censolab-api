package com.censolab.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.censolab.api.model.Professor;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long>{

}
