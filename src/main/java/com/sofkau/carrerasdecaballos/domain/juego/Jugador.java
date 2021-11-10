package com.sofkau.carrerasdecaballos.domain.juego;


import com.sofkau.carrerasdecaballos.domain.generic.Entity;
import com.sofkau.carrerasdecaballos.domain.juego.values.JugadorID;
import com.sofkau.carrerasdecaballos.domain.juego.values.Nombre;

public class Jugador extends Entity<JugadorID> {
    protected Nombre nombre;

    public Jugador(JugadorID entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre verNombre() {
        return nombre;
    }

    public void asignarNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
