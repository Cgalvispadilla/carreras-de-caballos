package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.values.JugadorID;

public class PrimerLugarAsignado extends DomainEvent {

    private final JugadorID jugadorId;

    public PrimerLugarAsignado(JugadorID jugadorId) {
        super("juego.primerlugarasignado");
        this.jugadorId = jugadorId;
    }

    public JugadorID getJugadorId() {
        return jugadorId;
    }
}
