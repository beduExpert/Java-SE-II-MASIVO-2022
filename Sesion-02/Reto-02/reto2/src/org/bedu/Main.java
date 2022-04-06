package org.bedu;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Hilo1());
        Thread t2 = new Thread(new Hilo2());
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
