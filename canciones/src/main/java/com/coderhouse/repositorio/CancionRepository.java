package com.coderhouse.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.modelo.Cancion;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Integer> {
    List<Cancion> findByInterpreteId(Integer interpreteId);
    
    List<Cancion> findAll();
}
