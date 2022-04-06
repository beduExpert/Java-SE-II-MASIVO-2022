package org.bedu.jse2.demo.reactive.ejemplo3;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonaEntity {
    private final String nombre;
    private final String primerApellido;
    private final String segundoApellido;

    private final String telefono;
}
