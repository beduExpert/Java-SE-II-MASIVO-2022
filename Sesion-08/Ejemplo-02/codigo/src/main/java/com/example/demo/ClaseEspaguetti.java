package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cita")
public class ClaseEspaguetti {

    private final CitaRepository repository;

    @Autowired
    public ClaseEspaguetti(CitaRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void guardarCita(Cita cita){

        if(repository.findAllByContenido(cita.getContenido()).size() > 0){
            throw new RuntimeException("La cita ya fue registrada");
        }

         repository.save(cita);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Cita buscarCita(Long id){
       return repository.findById(id).get();
    }
}
