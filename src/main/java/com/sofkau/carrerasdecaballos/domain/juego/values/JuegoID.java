package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.Identity;

public class JuegoID extends Identity {
    public JuegoID() {
    }

    public  JuegoID(String id){super(id);}

    public static JuegoID of(String id) {return new JuegoID(id);}
}
