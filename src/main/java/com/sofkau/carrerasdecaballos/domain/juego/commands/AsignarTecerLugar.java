package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;
import com.sofkau.carrerasdecaballos.domain.juego.values.JugadorID;

public class AsignarTecerLugar extends Command {
    private JugadorID jugadorId;

    public AsignarTecerLugar(JugadorID jugadorId) {
        this.jugadorId = jugadorId;
    }

    public JugadorID getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(JugadorID jugadorId) {
        this.jugadorId = jugadorId;
    }
}
