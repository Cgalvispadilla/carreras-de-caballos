package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Jugador;
import com.sofkau.carrerasdecaballos.domain.juego.Pista;

import java.util.Map;

public class JuegoCreado extends DomainEvent {
    private final Pista pista;
    private final Map<String, Jugador> jugadores;

    public JuegoCreado(Pista pista, Map<String, Jugador> jugadores) {
        super("juego.juegocreado");
        this.pista = pista;
        this.jugadores = jugadores;
    }

    public Pista getPista() {
        return pista;
    }
}
