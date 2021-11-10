package com.sofkau.carrerasdecaballos.domain.carril.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

import java.util.Objects;

public class Jinete implements ValueObject<String> {

    private final String jinete;


    public Jinete(String jinete) {

        this.jinete = jinete;
    }

    @Override
    public String value() {
        return jinete;
    }
}
