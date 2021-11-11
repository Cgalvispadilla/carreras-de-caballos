package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class JugadorCreado extends DomainEvent {
    private final String jugadorID;
    private final String nombre;

    public JugadorCreado(String jugadorID, String nombre) {
        super("juego.jugardorcreado");
        this.jugadorID = jugadorID;
        this.nombre = nombre;
    }

    public String getEntityId() {
        return jugadorID;
    }

    public String getNombre() {
        return nombre;
    }
}
