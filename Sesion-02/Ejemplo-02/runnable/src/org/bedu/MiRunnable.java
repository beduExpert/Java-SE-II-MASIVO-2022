package org.bedu;

import java.util.concurrent.TimeUnit;

public class MiRunnable implements Runnable {
    private String parametro, nombre;

    public MiRunnable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while(!"terminar".equals(parametro)){
            mostrarInformacion();
            pausarUnSegundo();
        }
        mostrarInformacion();
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public static void pausarUnSegundo() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void mostrarInformacion() {
        System.out.println("Hilo: " + nombre + "\t| Párametro: " + parametro);
    }
}
