package com.sofkau.carrerasdecaballos.domain.carril.values;

public class Posicion {
    private final Integer posActual;
    private final Integer meta;

    public Posicion(Integer posActual, Integer meta){
        this.posActual = posActual;
        this.meta = meta;
        if (posActual < 0) {
            throw new IllegalArgumentException("La posicion no puede ser negativa");
        }
        if (meta < 0) {
            throw new IllegalArgumentException("La metal no puede ser negativa");
        }
    }


    public Integer getMeta() {
        return meta;
    }

    public Integer getPosActual() {
        return posActual;
    }


}
