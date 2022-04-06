package org.bedu;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        EventLoopSimple eventLoop = new EventLoopSimple(evento -> {
            if(evento instanceof String){
                System.out.println("String recibido: " + evento);
            }
            else if(evento instanceof Number){
                System.out.println("Número recibido: " + evento);
            }
        });

        eventLoop.iniciar();
        eventLoop.registrarEvento("Hola mundo");

        try {
            TimeUnit.MILLISECONDS.sleep(500); //simulando acciones diferentes con un sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eventLoop.registrarEvento(1);
        eventLoop.registrarEvento("Adiós");
        eventLoop.registrarEvento(10.0);

        eventLoop.detener();
    }
}
