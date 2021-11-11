package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;

public class IniciarJuego extends Command {
    private String juegoID;

    public IniciarJuego(String juegoID) {
        this.juegoID = juegoID;
    }

    public IniciarJuego() {
    }

    public String getJuegoID() {
        return juegoID;
    }

    public void setJuegoID(String juegoID) {
        this.juegoID = juegoID;
    }
}