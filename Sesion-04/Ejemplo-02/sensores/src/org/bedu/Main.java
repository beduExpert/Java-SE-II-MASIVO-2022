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
        List<Integer> ids = IntStream.range(1, 11)
                .mapToObj(i -> i)
                .collect(Collectors.toList()); //creamos una lista del 1 al 10


        obtenerPromedio(ids.stream());          //procesamiento concurrente

        //Procesamiento asíncrono
        List<CompletableFuture<Double>> futuros = ids.stream()
                //llamamos a la ejecución de la lectura de los sensores de manera asíncrona
                .map(id -> CompletableFuture.supplyAsync(() -> new SistemaMedicion().leer(id)))
                .collect(Collectors.toList());

        LocalTime inicio = LocalTime.now(); //registramos el tiempo de inicio
        double promedio = futuros.stream()
                .mapToDouble(cf -> cf.join())//extraemos el valor del CompletableFuture
                .average()                  //calculamos promedio
                .orElse(0);
        Duration tiempo = Duration.between(inicio, LocalTime.now());    //registramos el tiempo de fin
        System.out.println((Math.round(promedio * 100.) / 100.) + " en " + tiempo.toMillis() + "ms"); //imprimimos el resultado
    }

    static void obtenerPromedio(Stream<Integer> ids){
        LocalTime inicio = LocalTime.now(); //registramos el tiempo de inicio
        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id)) //pasamos el stream de números a nuestro sensor
                .average()      //calcula el promedio de los valores
                .orElse(0); // retorna 0 si no pudo obtener los valores
        Duration tiempo = Duration.between(inicio, LocalTime.now());    //registramos el tiempo de fin
        System.out.println((Math.round(promedio * 100.) / 100.) + " en " + tiempo.toMillis() + "ms"); //imprimimos el resultado
    }
}
