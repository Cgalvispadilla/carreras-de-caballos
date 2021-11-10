package com.sofkau.carrerasdecaballos.domain.juego.events;


import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Pista;

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
