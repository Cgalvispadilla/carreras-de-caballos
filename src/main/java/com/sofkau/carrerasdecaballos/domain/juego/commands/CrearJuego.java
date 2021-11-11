package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;

import java.util.Map;

public class CrearJuego extends Command {
    private String juegoId;
    private Integer kilometros;
    private Map<String, String> jugadores;

    public CrearJuego() {
    }

    public CrearJuego(String juegoID,Integer kilometros, Map<String,String> jugadores) {
        this.kilometros = kilometros;
        this.jugadores = jugadores;
        this.juegoId =juegoID;
    }

    public String getJuegoId() {
        return juegoId;
    }

    public void setJuegoId(String juegoId) {
        this.juegoId = juegoId;
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

    public void setJugadores(Map<String,String> jugadores) {
        this.jugadores = jugadores;
    }
}
