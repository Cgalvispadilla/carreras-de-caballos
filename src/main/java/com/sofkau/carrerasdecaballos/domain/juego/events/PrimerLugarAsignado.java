package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class PrimerLugarAsignado extends DomainEvent {

    private final String jugadorId;

    public PrimerLugarAsignado(String jugadorId) {
        super("juego.primerlugarasignado");
        this.jugadorId = jugadorId;
    }

    public String getJugadorId() {
        return jugadorId;
    }
}
