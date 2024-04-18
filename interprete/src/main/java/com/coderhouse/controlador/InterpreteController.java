package com.coderhouse.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelo.Interprete;
import com.coderhouse.servicio.InterpreteService;

@RestController
@RequestMapping("/interprete")
public class InterpreteController {

	@Autowired
	private InterpreteService interpreteService;

	// Método para obtener el ID de un intérprete por su nombre
	@GetMapping(value = "/{nombre}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Integer getInterpreteByNombre(@PathVariable("nombre") String nombre) {
		return interpreteService.obtenerIdSegunNombre(nombre);
	}

	// Método para listar todos los intérpretes
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Interprete> listarTodosLosInterpretes() {
		return interpreteService.listarTodosLosInterpretes();
	}

	// Método para obtener un intérprete por su ID
	@GetMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Interprete getInterpreteById(@PathVariable("id") Integer id) {
		return interpreteService.obtenerInterpretePorId(id);
	}

	// Método para crear un nuevo intérprete
	@PostMapping(value = "/", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.CREATED)
	public Interprete crearInterprete(@RequestBody Interprete interprete) {
		return interpreteService.crearInterprete(interprete);
	}

	// Método para actualizar un intérprete existente
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Interprete actualizarInterprete(@PathVariable("id") Integer id, @RequestBody Interprete interprete) {
		return interpreteService.actualizarInterprete(id, interprete);
	}

	// Método para eliminar un intérprete
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarInterprete(@PathVariable("id") Integer id) {
		interpreteService.eliminarInterprete(id);
	}
}
