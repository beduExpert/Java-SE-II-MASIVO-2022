package org.bedu.jse2.demo.ejemplos;

import java.util.function.Function;

public class Ejemplo1 {

   private final Function<String, Integer> parser = Integer::parseInt;

    Integer sumar(String a, String b) {

        return parser.apply(a) + parser.apply(b);
    }
}
