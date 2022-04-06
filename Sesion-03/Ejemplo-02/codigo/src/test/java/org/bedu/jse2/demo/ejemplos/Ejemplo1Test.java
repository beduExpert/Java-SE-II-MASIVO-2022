package org.bedu.jse2.demo.ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo1Test {

    @Test
    @DisplayName("Suma dos strings convertidos a enteros")
    void addsUpTwoIntegers(){
        String a = "4";
        String b = "8";
        Integer expected = 12;

        Ejemplo1 ejemplo1 = new Ejemplo1();

        assertEquals(expected, ejemplo1.sumar(a,b));
    }

}