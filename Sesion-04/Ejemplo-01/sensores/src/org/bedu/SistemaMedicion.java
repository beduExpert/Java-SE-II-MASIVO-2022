package org.bedu;

import java.util.concurrent.TimeUnit;

public class SistemaMedicion {
    double leer(int id){
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id * Math.random();
    }
}
