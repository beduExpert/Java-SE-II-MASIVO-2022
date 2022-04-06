package org.bedu.javase2.ejemplo.ejemplo1.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipos1_fk", referencedColumnName = "id")
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name = "equipos2_fk", referencedColumnName = "id")
    private Equipo equipo2;

    @Column(name="marcador_equipo_1")
    private Integer marcadorEquipo1;

    @Column(name="marcador_equipo_2")
    private Integer marcadorEquipo2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getMarcadorEquipo1() {
        return marcadorEquipo1;
    }

    public void setMarcadorEquipo1(Integer marcadorEquipo1) {
        this.marcadorEquipo1 = marcadorEquipo1;
    }

    public Integer getMarcadorEquipo2() {
        return marcadorEquipo2;
    }

    public void setMarcadorEquipo2(Integer marcadorEquipo2) {
        this.marcadorEquipo2 = marcadorEquipo2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Partido)) return false;
        Partido partido = (Partido) o;
        return id.equals(partido.id) &&
                equipo1.equals(partido.equipo1) &&
                equipo2.equals(partido.equipo2) &&
                marcadorEquipo1.equals(partido.marcadorEquipo1) &&
                marcadorEquipo2.equals(partido.marcadorEquipo2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, equipo1, equipo2, marcadorEquipo1, marcadorEquipo2);
    }
}

