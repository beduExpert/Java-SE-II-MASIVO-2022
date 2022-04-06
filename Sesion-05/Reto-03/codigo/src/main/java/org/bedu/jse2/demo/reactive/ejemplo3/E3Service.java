package org.bedu.jse2.demo.reactive.ejemplo3;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class E3Service {
    private static final E3Repository REPOSITORY = new E3Repository();

    public Flux<String> getListaNombre() {
        //Tu implementación va aquí
        return null;
    }


    public Mono<Agenda> buscarPorNombre(String nombre) {
        return REPOSITORY.getPersonas()
                .filter(p -> filterFunction(p, nombre))
                .map(this::personToAgenda)
                .next();

    }

    private Boolean filterFunction(PersonaEntity p, String nombre) {
        return p.getNombre().contains(nombre) || p.getPrimerApellido().contains(nombre) || p.getSegundoApellido().contains(nombre);
    }

    private Agenda personToAgenda(PersonaEntity p) {
        return new Agenda(String.format("%s %s %s", p.getNombre(), p.getPrimerApellido(), p.getSegundoApellido()), p.getTelefono());
    }


}
