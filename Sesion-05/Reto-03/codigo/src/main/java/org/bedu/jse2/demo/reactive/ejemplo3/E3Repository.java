package org.bedu.jse2.demo.reactive.ejemplo3;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class E3Repository {

    private static final PersonaEntity[] LISTA = {new PersonaEntity("Juan", "Romo", "Pérez", "5550000001"),
            new PersonaEntity("Diana", "Sánchez", "García", "5550000002"),
            new PersonaEntity("Sebastián", "Rodríguez", "Soto", "5550000003")};

    public Flux<PersonaEntity> getPersonas(){
        return Flux.fromArray(LISTA).delayElements(Duration.ofSeconds(2));
    }

}
