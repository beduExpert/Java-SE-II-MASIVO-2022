package org.bedu.jse2.demo.reactive.ejemplo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ejemplo2Test {

    @Test
    @DisplayName("Suma los elementos y regresa Single")
    void sumaElementos() {
        Ejemplo2.sumarSingle()
                .subscribe(s -> assertThat(s).isEqualTo(21));
    }

    @Test
    @DisplayName("Suma los elementos y regresa valor (bloqueante)")
    void sumaElementosBloqueante() {
        assertThat(Ejemplo2.sumar()).isEqualTo(21);
    }
}