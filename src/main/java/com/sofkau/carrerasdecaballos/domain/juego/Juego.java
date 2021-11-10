package com.sofkau.carrerasdecaballos.domain.juego;


import com.sofkau.carrerasdecaballos.domain.generic.AggregateRoot;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.events.*;
import com.sofkau.carrerasdecaballos.domain.juego.values.*;

import java.util.List;
import java.util.Map;

public class Juego extends AggregateRoot {
    protected Map<JugadorID, Jugador> jugadores;
    protected Pista pista;
    protected Podio podio;
    protected JuegoActivo juegoActivo;

    public Juego(JuegoID juegoID, Pista pista) {
        super(juegoID.value());
        appendChange(new JuegoCreado(pista)).apply();
    }

    private Juego(JuegoID id) {
        super(id.value());
        subscribe(new JuegoEventChange(this));
    }

    public static Juego from(JuegoID id, List<DomainEvent> events) {
        var juego = new Juego(id);
        events.forEach(juego::applyEvent);
        return juego;
    }

    public void crearJugador(JugadorID entityId, Nombre nombre) {
        appendChange(new JugadorCreado(entityId, nombre)).apply();
    }

    public void iniciarJuego() {
        appendChange(new JuegoIniciado()).apply();
    }

    public void asignarPrimerLugar(JugadorID jugadorId) {
        appendChange(new PrimerLugarAsignado(jugadorId)).apply();
    }

    public void asignarSegundoLugar(JugadorID jugadorId) {
        appendChange(new SegundoLugarAsignado(jugadorId)).apply();
    }

    public void asignarTercerLugar(JugadorID jugadorId) {
        appendChange(new TercerLugarAsignado(jugadorId)).apply();
        appendChange(new JuegoFinalizado(podio)).apply();
    }

    public Map<JugadorID, Jugador> jugadores() {
        return Map.copyOf(jugadores);
    }

    public Boolean jugando() {
        return juegoActivo.value();
    }

    public Pista obtenerPista() {
        return pista;
    }

    public Podio.Props obtenerPodio() {
        return podio.value();
    }
}
