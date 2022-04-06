package org.bedu.javase2.ejemplo.ejemplo1.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.model.Equipo;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepository extends CrudRepository<Equipo, Long> {
    Iterable<Equipo> findAllByNombre(String nombre);
}
