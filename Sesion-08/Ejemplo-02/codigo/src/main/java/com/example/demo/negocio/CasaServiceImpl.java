package com.example.demo.negocio;

import com.example.demo.modelo.Casa;
import com.example.demo.repositorio.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CasaServiceImpl implements CasaService {

    private CasaRepository repository;

    @Autowired
    public CasaServiceImpl(CasaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void guardar(Casa casa) {
        if (casa.getJefeDeFamilia() == null)
            throw new RuntimeException("Se debe tener un padre de familia");

        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        casa.setOtros(casa.getOtros().stream().map(String::toUpperCase).collect(Collectors.toList()));

        repository.save(casa);
    }

    @Override
    public Casa buscarPorId(Long id) {
        return repository.findById(id).get();
    }
}
