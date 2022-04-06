package org.bedu.javase2.ejemplo.ejemplo1.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.model.Partido;
import org.springframework.data.repository.CrudRepository;

public interface PartidoRepository extends CrudRepository<Partido, Long> {
}
