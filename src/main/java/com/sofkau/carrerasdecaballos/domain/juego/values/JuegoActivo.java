package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

public class JuegoActivo implements ValueObject<Boolean> {
    private Boolean value;

    public JuegoActivo(Boolean value) {
        this.value = value;
    }
    @Override
    public Boolean value() {
        return value;
    }
}
