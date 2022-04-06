package com.example.demo.repositorio;

import com.example.demo.modelo.Casa;
import org.springframework.data.repository.CrudRepository;

public interface CasaRepository extends CrudRepository<Casa, Long> {
}
