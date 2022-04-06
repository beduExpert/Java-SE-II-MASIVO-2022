package org.bedu.jse2.demo.ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Ejemplo2Test {
    private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, -5, 9);

    @Test
    @DisplayName("Negativos")
    void negatives() {
        Ejemplo2 ejemplo2 = new Ejemplo2();

        List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> -s);

        assertThat(real).containsExactly(-1, -4, -6, -2, 5, -9);

    }

    @Test
    @DisplayName("Cuadrados")
    void squares() {
        Ejemplo2 ejemplo2 = new Ejemplo2();

        List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> s * s);

        assertThat(real).containsExactly(1, 16, 36, 4, 25, 81);

    }
}