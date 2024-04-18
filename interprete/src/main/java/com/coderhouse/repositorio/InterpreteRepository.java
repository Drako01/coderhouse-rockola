package com.coderhouse.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.modelo.Interprete;

@Repository
public interface InterpreteRepository extends JpaRepository<Interprete, Integer> {
	Interprete findByNombre(String nombre);	
	
	List<Interprete> findAll();
}
