package org.bedu.jse2.generics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolderTest {

    private class ClasePropia {
        private  final String nombre;
        private final Integer edad;

        ClasePropia(String nombre, Integer edad){
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre(){
            return nombre;
        }

        public Integer getEdad(){
            return edad;
        }
    }

    @Test
    @DisplayName("Puede guardar un Integer")
    void entero(){
        Integer entero = 123;
        Holder<Integer> holder = new Holder<>();
        holder.hold(entero);

        assertEquals(entero, holder.release());

    }

    @Test
    @DisplayName("Puede guardar un String")
    void string(){
        String str = "Hola mundo";
        Holder<String> holder = new Holder<>();
        holder.hold(str);

        assertEquals(str, holder.release());

    }


    @Test
    @DisplayName("Puede guardar una clase propia")
    void custom(){

        ClasePropia cp = new ClasePropia("Juan", 20);

        Holder<ClasePropia> holder = new Holder<>();
        holder.hold(cp);

        assertEquals(cp.getNombre(), "Juan");
        assertEquals(cp.getEdad(), 20);

    }

}