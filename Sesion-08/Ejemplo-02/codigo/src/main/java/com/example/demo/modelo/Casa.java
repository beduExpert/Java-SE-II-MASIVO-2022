package com.example.demo.modelo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jefeDeFamilia;

    @ElementCollection
    private Collection<String> otros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJefeDeFamilia() {
        return jefeDeFamilia;
    }

    public void setJefeDeFamilia(String jefeDeFamilia) {
        this.jefeDeFamilia = jefeDeFamilia;
    }

    public Collection<String> getOtros() {
        return otros;
    }

    public void setOtros(Collection<String> otros) {
        this.otros = otros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Casa)) return false;
        Casa casa = (Casa) o;
        return id.equals(casa.id) &&
                jefeDeFamilia.equals(casa.jefeDeFamilia) &&
                otros.equals(casa.otros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jefeDeFamilia, otros);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "id=" + id +
                ", jefeDeFamilia='" + jefeDeFamilia + '\'' +
                ", otros=" + otros +
                '}';
    }
}
