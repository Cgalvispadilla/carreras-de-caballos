package com.sofkau.carrerasdecaballos.domain.carril.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {

    private final Boolean estado;

    public Estado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public Boolean value() {
        return estado;
    }
}
