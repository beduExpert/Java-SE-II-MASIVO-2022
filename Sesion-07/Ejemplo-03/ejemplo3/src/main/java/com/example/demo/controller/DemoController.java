package com.example.demo.controller;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/empleados")
public class DemoController {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    private Flux<Empleado> getAllEmpleados() {
        return empleadoRepository.findAllEmpleados();
    }

}
