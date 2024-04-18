package com.coderhouse.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.modelo.Interprete;
import com.coderhouse.repositorio.InterpreteRepository;

@Service
public class InterpreteService {

	@Autowired
	private InterpreteRepository interpreteRepository;

	public Integer obtenerIdSegunNombre(String nombre) {
		Interprete interprete = interpreteRepository.findByNombre(nombre);
		return interprete != null ? interprete.getId() : null;
	}

	public List<Interprete> listarTodosLosInterpretes() {
		return interpreteRepository.findAll();
	}

	public Interprete obtenerInterpretePorId(Integer id) {
		Optional<Interprete> optionalInterprete = interpreteRepository.findById(id);
		return optionalInterprete.orElse(null);
	}

	public Interprete crearInterprete(Interprete interprete) {
		return interpreteRepository.save(interprete);
	}

	public Interprete actualizarInterprete(Integer id, Interprete interprete) {
		interprete.setId(id);
		return interpreteRepository.save(interprete);
	}

	public void eliminarInterprete(Integer id) {
		interpreteRepository.deleteById(id);
	}
}