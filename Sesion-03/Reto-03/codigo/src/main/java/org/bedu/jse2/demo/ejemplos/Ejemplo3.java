package org.bedu.jse2.demo.ejemplos;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Ejemplo3 {
    Integer manipular(List<Integer> conjunto, IntUnaryOperator transformacion) {
        return conjunto.stream().mapToInt(s -> s).map(transformacion).sum();
    }

    Integer filtrarTransformarYSumar(List<Integer> conjunto, Predicate<Integer> filtro, IntUnaryOperator funcion) {
        return conjunto.stream().filter(filtro).mapToInt(s -> s).map(funcion).sum();
    }
}
