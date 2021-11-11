package com.sofkau.carrerasdecaballos.domain.juego;



import java.util.Objects;

public class Jugador  {

    protected final String jugadorID;
    protected String nombre;

    public Jugador(String jugadorID, String nombre) {
        this.jugadorID = Objects.requireNonNull(jugadorID);
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
