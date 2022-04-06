package org.bedu.jse2.demo.reactive.ejemplo3;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class E3Controller {
    private static final E3Service SERVICE = new E3Service();

    public Flux<String> nombresUsuarios() {
        return SERVICE.getListaNombre();
    }

    public Mono<Agenda> buscarPorNombre(String nombre) {
        return SERVICE.buscarPorNombre(nombre);
    }
}
