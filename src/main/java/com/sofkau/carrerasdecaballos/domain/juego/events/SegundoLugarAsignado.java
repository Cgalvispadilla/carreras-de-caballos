package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.values.JugadorID;

public class SegundoLugarAsignado extends DomainEvent {
    private final JugadorID jugadorId;

    public SegundoLugarAsignado(JugadorID jugadorId) {
        super("juego.segundolugarasignado");
        this.jugadorId = jugadorId;
    }

    public JugadorID getJugadorId() {
        return jugadorId;
    }
}
