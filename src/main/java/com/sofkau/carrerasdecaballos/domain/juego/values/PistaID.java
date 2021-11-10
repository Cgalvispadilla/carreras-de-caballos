package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.Identity;

public class PistaID extends Identity {
    public PistaID() {
    }

    public  PistaID(String id){super(id);}

    public static PistaID of(String id) {return new PistaID(id);}
}
