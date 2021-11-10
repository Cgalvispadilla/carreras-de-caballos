package com.sofkau.carrerasdecaballos.domain.juego;



import com.sofkau.carrerasdecaballos.domain.generic.EventChange;
import com.sofkau.carrerasdecaballos.domain.juego.events.*;
import com.sofkau.carrerasdecaballos.domain.juego.values.JuegoActivo;
import com.sofkau.carrerasdecaballos.domain.juego.values.Podio;

import java.util.HashMap;

public class JuegoEventChange implements EventChange {
    public JuegoEventChange(Juego juego) {
        listener((JuegoCreado event)->{
            juego.pista = event.getPista();
            juego.juegoActivo = new JuegoActivo(Boolean.FALSE);
            juego.jugadores = new HashMap<>();
            juego.podio = new Podio();
        });
        listener((JugadorCreado event)->{
            juego.jugadores.put(event.getEntityId(), new Jugador(event.getEntityId(), event.getNombre()));
        });
        listener((JuegoIniciado event) -> {
            juego.juegoActivo = new JuegoActivo(Boolean.TRUE);
        });
        listener((JuegoFinalizado event) -> {
            juego.juegoActivo = new JuegoActivo(Boolean.FALSE);
        });
        listener((PrimerLugarAsignado event) -> {
            if (juego.juegoActivo.value()) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio = juego.podio.asignarPrimerLugar(jugadorGanador);
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
        listener((SegundoLugarAsignado event) -> {
            if (juego.juegoActivo.value()) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio = juego.podio.asignarSegundoLugar(jugadorGanador);
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
        listener((TercerLugarAsignado event) -> {
            if (juego.juegoActivo.value()) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio = juego.podio.asignarTercerLugar(jugadorGanador);
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
    }
}
