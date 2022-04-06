package org.bedu.javase2.ejemplo.ejemplo1.persistence;

import org.bedu.javase2.ejemplo.ejemplo1.model.Equipo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ComponentScan(basePackages = "org.bedu.javase2.ejemplo.ejemplo1")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EquipoRepositoryTest {

   @Autowired
   private EquipoRepository repository;

   @BeforeAll
   void cleanDatabase(){
      repository.deleteAll();
   }

   @Test
   @DisplayName("Puede guardar")
   void canSave(){
      Equipo equipo = new Equipo();
      equipo.setNombre("Equipo prueba");

      equipo = repository.save(equipo);

      assertNotNull(equipo.getId());
   }

   @Test
   @DisplayName("Busca por nombre")
   void canFindByName(){
      final String nombre = "Prueba búsqueda";

      Equipo equipo = new Equipo();
      equipo.setNombre(nombre);

      repository.save(equipo);

      Iterable<Equipo> listaEquipos = repository.findAllByNombre(nombre);
      assertTrue(listaEquipos.iterator().hasNext());

      Equipo equipoRecuperado = listaEquipos.iterator().next();
      assertEquals(equipo, equipoRecuperado);

   }

}