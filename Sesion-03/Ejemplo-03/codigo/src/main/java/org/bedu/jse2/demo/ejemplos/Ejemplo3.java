package org.bedu.jse2.demo.ejemplos;

import java.util.List;
import java.util.function.IntUnaryOperator;

public class Ejemplo3 {
    Integer manipular(List<Integer> conjunto, IntUnaryOperator transformacion){
        return conjunto.stream().mapToInt(s -> s).map(transformacion).sum();
    }
}
