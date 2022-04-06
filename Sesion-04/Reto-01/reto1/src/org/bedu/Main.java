package org.bedu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(0, 1000)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        obtenerSuma(ids.parallelStream());  //procesamiento paralelo
    }

    private static void obtenerSuma(Stream<Integer> ids) {
        double suma = ids.mapToDouble(id -> new CadenaRestaurantes()
                .obtenerGananciasFranquicia(id))
                .sum();
        System.out.println(String.format("Las ganancias totales son: $%5.2f", suma));
    }
}
