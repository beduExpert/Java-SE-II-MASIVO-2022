package com.example.demo.controller;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/empleados")
public class DemoController {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/{id}")
    private Mono<Empleado> getEmpleadoById(@PathVariable String id) {
        return empleadoRepository.findById(id);
    }

    @GetMapping
    private Flux<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @PostMapping("/update")
    private Mono<Empleado> updateEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
