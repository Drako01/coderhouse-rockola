package com.coderhouse.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.modelo.Cancion;
import com.coderhouse.repositorio.CancionRepository;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;

    public List<Cancion> obtenerCancionesPorIdDeInterprete(Integer interpreteId) {
        return cancionRepository.findByInterpreteId(interpreteId);
    }

    public Cancion obtenerCancionPorId(Integer id) {
        Optional<Cancion> cancionOptional = cancionRepository.findById(id);
        return cancionOptional.orElse(null);
    }

    public List<Cancion> listarTodasLasCanciones() {
        return cancionRepository.findAll();
    }

    public Cancion crearCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    public Cancion actualizarCancion(Integer id, Cancion cancion) {
        cancion.setId(id);
        return cancionRepository.save(cancion);
    }

    public void eliminarCancion(Integer id) {
        cancionRepository.deleteById(id);
    }
}
