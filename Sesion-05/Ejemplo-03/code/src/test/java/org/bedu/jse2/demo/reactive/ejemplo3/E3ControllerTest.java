package org.bedu.jse2.demo.reactive.ejemplo3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class E3ControllerTest {

    private static final List<String> NOMBRES = Arrays.asList(new String[]{"Romo Përez, Juan", "Sánchez García, Diana", "Rodríguez Soto, Sebastian"});

    @Test
    @DisplayName("Ejercicio 3")
    void testTransformacion() {
        E3Controller controller = new E3Controller();

        controller.nombresUsuarios()
                .subscribe(nombre -> Assertions.assertThat(NOMBRES.contains(nombre)).isTrue());
    }

}