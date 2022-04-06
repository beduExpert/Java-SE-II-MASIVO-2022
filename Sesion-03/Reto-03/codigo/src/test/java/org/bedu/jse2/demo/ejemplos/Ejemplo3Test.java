package org.bedu.jse2.demo.ejemplos;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Ejemplo3Test {

    @Test
    @DisplayName("Manipula y suma")
    void transformsAndAdsUp() {
        Ejemplo3 ejemplo3 = new Ejemplo3();

        List<Integer> conjunto = Arrays.asList(1, 4, -6, 7, 3, 5, -1);

        Integer expected = -27;

        Assertions.assertThat(ejemplo3.manipular(conjunto, i -> i < 0 ? i : -i)).isEqualTo(expected);

    }

    @Test
    @DisplayName("Filtro, transformación y suma")
    void filterTransformAndAddsUp() {

        Ejemplo3 ejemplo3 = new Ejemplo3();

        List<Integer> conjunto = Arrays.asList(1, 4, -6, 7, 3, 5, -1);

        Integer expected = -189;

        Assertions.assertThat(ejemplo3.filtrarTransformarYSumar(conjunto,
                v -> v % 3 == 0,
                i -> i * i * i))
                .isEqualTo(expected);
    }

}