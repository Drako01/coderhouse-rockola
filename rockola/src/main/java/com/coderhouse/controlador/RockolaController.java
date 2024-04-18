package com.coderhouse.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rockola")
public class RockolaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/canciones/{nombreInterprete}")
    public ResponseEntity<?> getCancionesPorNombreInterprete(@PathVariable String nombreInterprete) {
        // Llamar al microservicio de Intérprete para obtener el ID del intérprete
        ResponseEntity<Integer> responseEntity = restTemplate.getForEntity("http://localhost:8081/interprete/{nombre}",
                Integer.class, nombreInterprete);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            Integer interpreteId = responseEntity.getBody();
            // Llamar al microservicio de Canciones para obtener las canciones por ID de intérprete
            ResponseEntity<?> cancionesResponse = restTemplate.getForEntity(
                    "http://localhost:8082/canciones/{id}", Object.class, interpreteId);
            return ResponseEntity.status(cancionesResponse.getStatusCode()).body(cancionesResponse.getBody());
        } else {
            return ResponseEntity.status(responseEntity.getStatusCode()).body(responseEntity.getBody());
        }
    }
}
