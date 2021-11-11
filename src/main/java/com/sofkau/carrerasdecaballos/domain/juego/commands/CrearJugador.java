package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;

public class CrearJugador extends Command {
    private String jugadorID;
    private String nombre;

    public CrearJugador(String jugadorID, String nombre) {
        this.jugadorID = jugadorID;
        this.nombre = nombre;
    }

    public String getJugadorID() {
        return jugadorID;
    }

    public void setJugadorID(String jugadorID) {
        this.jugadorID = jugadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
