package com.maurote.portfolio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String habilidad;
    private int porcentaje;
    
    @ManyToOne
    //(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "plataforma_id") 
    @JsonIgnore
    private Plataforma plataforma;

    public Habilidad() {
    }

    public Habilidad(long id, String habilidad, int porcentaje, Plataforma plataforma) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.plataforma = plataforma;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHabilidad() {
        return this.habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Plataforma getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
    
    
}
