package com.sofkau.carrerasdecaballos.domain.juego;


import com.sofkau.carrerasdecaballos.domain.generic.AggregateRoot;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.generic.EventChange;
import com.sofkau.carrerasdecaballos.domain.juego.events.*;

import java.util.List;
import java.util.Map;

public class Juego extends AggregateRoot implements EventChange {

    protected String juegoID;
    protected Map<String, Jugador> jugadores;
    protected Pista pista;
    protected Podio podio;
    protected boolean juegoActivo;

    public Juego(String juegoID, Pista pista, Map<String, Jugador> jugadores) {
        super(juegoID);
        appendChange(new JuegoCreado(pista, jugadores)).apply();
    }

    private Juego(String juegoID) {
        super(juegoID);
        subscribe(new JuegoEventChange(this));
    }

    public static Juego from(String juegoID, List<DomainEvent> events) {
        var juego = new Juego(juegoID);
        events.forEach(juego::applyEvent);
        return juego;
    }



    public void iniciarJuego() {
        appendChange(new JuegoIniciado()).apply();
    }

    public void asignarPrimerLugar(String jugadorId) {
        appendChange(new PrimerLugarAsignado(jugadorId)).apply();
    }

    public void asignarSegundoLugar(String jugadorId) {
        appendChange(new SegundoLugarAsignado(jugadorId)).apply();
    }

    public void asignarTercerLugar(String jugadorId) {
        appendChange(new TercerLugarAsignado(jugadorId)).apply();
        appendChange(new JuegoFinalizado(podio)).apply();
    }

    public Map<String, Jugador> jugadores() {
        return Map.copyOf(jugadores);
    }

    public boolean jugando() {
        return juegoActivo;
    }

    public Pista obtenerPista() {
        return pista;
    }

    public Podio obtenerPodio() {
        return podio;
    }
}
