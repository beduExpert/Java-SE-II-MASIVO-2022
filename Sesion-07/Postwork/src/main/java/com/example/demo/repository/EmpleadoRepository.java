
package com.example.demo.repository;

import com.example.demo.entity.Empleado;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends ReactiveMongoRepository<Empleado, String>{
    
}
