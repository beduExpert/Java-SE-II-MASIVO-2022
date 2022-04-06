package org.bedu.javase2.ejemplo.ejemplo1.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.model.Equipo;
import org.bedu.javase2.ejemplo.ejemplo1.model.Partido;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ComponentScan(basePackages = "org.bedu.javase2.ejemplo.ejercicio1")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PartidoRepositoryTest {

    @Autowired
    private PartidoRepository repository;

    @Autowired
    private EquipoRepository equipoRepository;

    Equipo equipo1;
    Equipo equipo2;


    @BeforeAll
    void setupDatabase() {
        repository.deleteAll();
        equipoRepository.deleteAll();

        equipo1 = new Equipo();
        equipo1.setNombre("Equipo X");
        equipoRepository.save(equipo1);

        equipo2 = new Equipo();
        equipo2.setNombre("Equipo Y");
        equipoRepository.save(equipo2);
    }

    @Test
    @DisplayName("Busca por nombres")
    void searchMatchByNames() {

        Partido partido = new Partido();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setMarcadorEquipo1(0);
        partido.setMarcadorEquipo2(0);

        repository.save(partido);

        Iterable<Partido> conjuntoPartidos = repository.findAllByEquipo1NombreAndEquipo2Nombre("Equipo X", "Equipo Y");

    }

}