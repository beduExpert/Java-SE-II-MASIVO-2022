package org.bedu;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(0, 1000)
                .mapToObj(i -> i)
                .collect(Collectors.toList());

        List<CompletableFuture<Double>> futuros = ids.stream()
                .map(id -> CompletableFuture.supplyAsync(() -> new CadenaRestaurantes().obtenerGananciasFranquicia(id)))
                .collect(Collectors.toList());

        double suma = futuros.stream()
                .mapToDouble(cf -> cf.join())
                .sum();
        System.out.println(String.format("Las ganancias totales son: $%5.2f", suma));
    }

}
