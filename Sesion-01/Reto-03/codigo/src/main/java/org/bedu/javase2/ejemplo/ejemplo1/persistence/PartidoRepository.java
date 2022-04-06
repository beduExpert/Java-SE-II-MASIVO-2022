package org.bedu.javase2.ejemplo.ejemplo1.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.model.Partido;
import org.springframework.data.repository.CrudRepository;

public interface PartidoRepository extends CrudRepository<Partido, Long> {
    Iterable<Partido> findAllByEquipo1NombreAndEquipo2Nombre(String nombreEquipo1, String nombreEquipo2);
}
