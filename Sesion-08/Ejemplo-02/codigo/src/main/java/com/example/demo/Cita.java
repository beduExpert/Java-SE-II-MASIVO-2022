package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libro;
    private String autor;
    private String contenido;


    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cita)) return false;
        Cita cita = (Cita) o;
        return libro.equals(cita.libro) &&
                autor.equals(cita.autor) &&
                contenido.equals(cita.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, autor, contenido);
    }

    @Override
    public String toString() {
        return "Cita{" +
                "libro='" + libro + '\'' +
                ", autor='" + autor + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
