package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class JuegoIniciado extends DomainEvent {
    public JuegoIniciado() {
        super("juego.juegoiniciado");
    }
}
