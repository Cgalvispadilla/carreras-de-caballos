package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;

import java.util.Map;

public class CrearJuego extends Command {
    private String juegoID;
    private Integer kilometros;
    private Map<String, String> jugadores;

    public CrearJuego() {
    }

    public CrearJuego(Integer kilometros, Map<String, String> jugadores) {
        this.kilometros = kilometros;
        this.jugadores = jugadores;
    }

    public String getJuegoID() {
        return juegoID;
    }

    public void setJuegoID(String juegoID) {
        this.juegoID = juegoID;
    }

    public Integer getKilometros() {
        return kilometros;
    }

    public void setKilometros(Integer kilometros) {
        this.kilometros = kilometros;
    }

    public Map<String, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<String, String> jugadores) {
        this.jugadores = jugadores;
    }
}
