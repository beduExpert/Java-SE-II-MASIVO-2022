package org.bedu;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool(); // creamos un pool preconfigurado

        String[] nombres = {"Uno", "Dos", "Tres"}; //los nombres para nuestros hilos
        for (String nombre : nombres) {
            pool.execute(new MiRunnablePool(nombre)); // creamos cada hilo y lo ejecutamos
        }
        System.out.println("Estado del pool antes de apagar: isShutdown()=" + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());
        pool.shutdown(); // Apagamos el pool para que no pueda recibir nuevos hilos

        //pool.execute(new MiRunnablePool("Cuatro")); // si tratamos de hacer esto recibiremos una excepción
        System.out.println("Estado del pool después de apagar: isShutdown()=" + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());

        try {
            long tiempoLimiteMs = 100;
            System.out.println("Esperando que los hilos finalicen en " + tiempoLimiteMs + "ms...");

            boolean terminaron = pool.awaitTermination(tiempoLimiteMs, TimeUnit.MILLISECONDS); //Esperamos a los hilos por 100ms, retorna true si acabaron antes o hasta los 100ms o false si fueron interrumpidos
            System.out.println("¿Terminaron nuestros hilos? " +  terminaron);

            if(!terminaron){
                System.out.println("Llamando a shutdownNow()...");
                List<Runnable> pendientes = pool.shutdownNow(); //Termina los hilos que se estén ejecutando y retorna una lista de hilos pendientes a ejecutarse
                System.out.println(pendientes.size() + " hilos pendientes");
                terminaron = pool.awaitTermination(tiempoLimiteMs, TimeUnit.MILLISECONDS); //esperando otros 100ms a que terminen nuestros hilos

                if(!terminaron){
                    System.out.println("Aún hay hilos pendientes");
                }
                System.out.println("Saliendo de main");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
