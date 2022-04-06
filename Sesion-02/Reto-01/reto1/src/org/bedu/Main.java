package org.bedu;

public class Main {

    public static void main(String[] args) {
	    Hilo1 h1 = new Hilo1();
	    Hilo2 h2 = new Hilo2();
	    h2.setDaemon(true);

	    h1.start();
	    h2.start();
    }
}
