package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Podio;

public class JuegoFinalizado extends DomainEvent {
    private final Podio podio;

    public JuegoFinalizado(Podio podio) {
        super("juego.juegofinalizado");
        this.podio = podio;
    }

    public Podio getPodio() {
        return podio;
    }
}
