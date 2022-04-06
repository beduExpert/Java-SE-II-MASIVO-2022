package org.bedu;

public class Main {

    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Uno");
        hilo1.start();

        MiHilo hilo2 = new MiHilo("Dos");
        hilo2.setDaemon(true);
        hilo2.start();

        MiHilo.pausarUnSegundo();
        hilo1.setParametro("terminar"); // Demostrar qué pasa si no se pone esta línea
        System.out.println("**Fin del hilo main**");
    }
}
