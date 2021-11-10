package com.sofkau.carrerasdecaballos.domain.carril.values;


import com.sofkau.carrerasdecaballos.domain.generic.Identity;

public class CarrilID extends Identity {
    public CarrilID() {
    }

    public  CarrilID(String id){super(id);}

    public static CarrilID of(String id) {return new CarrilID(id);}
}
