package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;
import com.sofkau.carrerasdecaballos.domain.juego.values.JuegoID;
import com.sofkau.carrerasdecaballos.domain.juego.values.Kilometros;

import java.util.Map;

public class CrearJuego extends Command {
    private JuegoID juegoID;
    private Kilometros kilometros;
    private Map<String, String> jugadores;

    public CrearJuego() {
    }

    public CrearJuego(Kilometros kilometros, Map<String, String> jugadores) {
        this.kilometros = kilometros;
        this.jugadores = jugadores;
    }

    public JuegoID getJuegoID() {
        return juegoID;
    }

    public void setJuegoID(JuegoID juegoID) {
        this.juegoID = juegoID;
    }

    public Kilometros getKilometros() {
        return kilometros;
    }

    public void setKilometros(Kilometros kilometros) {
        this.kilometros = kilometros;
    }

    public Map<String, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<String, String> jugadores) {
        this.jugadores = jugadores;
    }
}
