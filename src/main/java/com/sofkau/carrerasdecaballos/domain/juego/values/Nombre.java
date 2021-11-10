package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private String value;

    public Nombre(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
