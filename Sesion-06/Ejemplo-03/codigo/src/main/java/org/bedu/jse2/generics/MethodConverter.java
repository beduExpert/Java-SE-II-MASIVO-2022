package org.bedu.jse2.generics;

public class MethodConverter {

    public static <E> String convertToString(E input){
        return input.toString();
    }
}
