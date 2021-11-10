package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.Identity;

public class JugadorID extends Identity {
    public JugadorID() {
    }

    public JugadorID(String id) {
        super(id);
    }

    public static JugadorID of(String id) {
        return new JugadorID(id);
    }
}