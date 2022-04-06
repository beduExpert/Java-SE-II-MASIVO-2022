package org.bedu.jse2.demo.reactive.generator;

import reactor.core.publisher.Flux;

public class ReactorFluxGenerator {
    private static final Integer[] LISTA = {1,2,3,4,5,6};

    public static Flux<Integer> fluxStream(){
        return Flux.fromArray(LISTA);
    }
}
