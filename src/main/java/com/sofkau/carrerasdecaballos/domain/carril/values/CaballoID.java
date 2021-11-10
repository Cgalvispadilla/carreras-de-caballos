package com.sofkau.carrerasdecaballos.domain.carril.values;


import com.sofkau.carrerasdecaballos.domain.generic.Identity;

public class CaballoID extends Identity {
    public CaballoID() {
    }

    public  CaballoID(String id){super(id);}

    public static CaballoID of(String id) {return new CaballoID(id);}
}
