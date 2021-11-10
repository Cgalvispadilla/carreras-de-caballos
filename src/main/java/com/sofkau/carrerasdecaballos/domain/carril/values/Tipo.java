package com.sofkau.carrerasdecaballos.domain.carril.values;

import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {

    private final String tipo;

    public Tipo(String tipo) {

        this.tipo = tipo;
    }

    @Override
    public String value() {
        return tipo;
    }
}
