package com.sofkau.carrerasdecaballos.domain.juego.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

import java.util.Objects;

public class Kilometros implements ValueObject<Integer> {
    private Integer value;

    public Kilometros(Integer value) {

        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
