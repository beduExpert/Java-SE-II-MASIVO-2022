package org.bedu.postwork.javase2project.persistence;

import org.bedu.postwork.javase2project.model.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
