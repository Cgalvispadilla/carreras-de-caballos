package com.sofkau.carrerasdecaballos.domain.juego;



import com.sofkau.carrerasdecaballos.domain.generic.EventChange;
import com.sofkau.carrerasdecaballos.domain.juego.events.*;

import java.util.HashMap;

public class JuegoEventChange implements EventChange {
    public JuegoEventChange(Juego juego) {
        listener((JuegoCreado event)->{
            juego.pista = event.getPista();
            juego.juegoActivo = false;
            juego.jugadores = new HashMap<>();
            juego.podio = new Podio();
        });
        listener((JugadorCreado event)->{
            juego.jugadores.put(event.getEntityId(), new Jugador(event.getEntityId(), event.getNombre()));
        });
        listener((JuegoIniciado event) -> {
            juego.juegoActivo = true;
        });
        listener((JuegoFinalizado event) -> {
            juego.juegoActivo = false;
        });
        listener((PrimerLugarAsignado event) -> {
            if (juego.juegoActivo) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio.setFirstPlace(jugadorGanador);
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
        listener((SegundoLugarAsignado event) -> {
            if (juego.juegoActivo) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio.setSecondPlace(jugadorGanador.verNombre());
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
        listener((TercerLugarAsignado event) -> {
            if (juego.juegoActivo) {
                Jugador jugadorGanador = juego.jugadores.get(event.getJugadorId());
                juego.podio.setThirdPlace(jugadorGanador.verNombre());
            } else {
                throw new IllegalArgumentException("No puede asignar al podio no esta en marcha el juego");
            }
        });
    }
}
