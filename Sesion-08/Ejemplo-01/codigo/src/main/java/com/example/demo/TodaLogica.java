package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/casa")
public class TodaLogica {

    private final CasaRepository repository;

    @Autowired
    public TodaLogica(CasaRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void guardarCasa(@RequestBody Casa casa) {
        if (casa.getJefeDeFamilia() == null)
            throw new RuntimeException("Se debe tener un padre de familia");

        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String nombre : casa.getOtros()) {
            otrosMayusculas.add(nombre.toUpperCase());
        }

        casa.setOtros(otrosMayusculas);

        repository.save(casa);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Casa getCasa(@PathVariable String id) {
        Long idInt = Long.parseLong(id);

        return repository.findById(idInt).get();
    }

}
