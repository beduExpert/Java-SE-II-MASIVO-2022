package org.bedu.jse2.generics;

public class EchoClass {

    public static <E> E echo(E input){
        return input;
    }
}
