package org.bedu;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CadenaRestaurantes {
    private Random rnd = new Random();

    public double obtenerGananciasFranquicia(int id){
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return rnd.nextInt(40000) + 10000;
    }
}
