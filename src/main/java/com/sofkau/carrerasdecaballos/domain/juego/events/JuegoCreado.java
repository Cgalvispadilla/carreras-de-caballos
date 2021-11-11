package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Jugador;
import com.sofkau.carrerasdecaballos.domain.juego.Pista;

import java.util.Map;

public class JuegoCreado extends DomainEvent {
    private final Pista pista;


    public JuegoCreado(Pista pista) {
        super("juego.juegocreado");
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }
}
