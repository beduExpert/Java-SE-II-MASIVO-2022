package org.bedu;

import java.util.concurrent.TimeUnit;

public class Hilo2 extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("Hilo2: Sigo en ejecución...");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
