package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class TercerLugarAsignado extends DomainEvent {
    private final String jugadorId;

    public TercerLugarAsignado(String jugadorId) {
        super("jugar.tercerlugarasignado");
        this.jugadorId = jugadorId;
    }

    public String getJugadorId() {
        return jugadorId;
    }
}
