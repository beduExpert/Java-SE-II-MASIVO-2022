package org.bedu.jse2.demo.reactive.ejemplo1;

import org.bedu.jse2.demo.reactive.generator.ReactorFluxGenerator;
import reactor.core.publisher.Mono;

public class Ejemplo2 {
    static Mono<Integer> sumarSingle(){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b) -> a + b);
    }

    static Integer sumar(){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b) -> a + b)
                .block();
    }
}
