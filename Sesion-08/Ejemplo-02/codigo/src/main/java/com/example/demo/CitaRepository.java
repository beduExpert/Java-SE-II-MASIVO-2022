package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitaRepository extends CrudRepository<Cita, Long> {

    List<Cita> findAllByContenido(String contenido);
}
