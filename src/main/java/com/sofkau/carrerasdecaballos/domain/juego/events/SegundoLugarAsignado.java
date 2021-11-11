package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class SegundoLugarAsignado extends DomainEvent {
    private final String jugadorId;

    public SegundoLugarAsignado(String jugadorId) {
        super("juego.segundolugarasignado");
        this.jugadorId = jugadorId;
    }

    public String getJugadorId() {
        return jugadorId;
    }
}
