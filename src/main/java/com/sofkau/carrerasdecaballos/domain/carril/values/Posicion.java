package com.sofkau.carrerasdecaballos.domain.carril.values;


import com.sofkau.carrerasdecaballos.domain.generic.ValueObject;

public class Posicion implements ValueObject<Posicion.Props> {

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

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Integer actual() {
                return posActual;
            }

            @Override
            public Integer meta() {
                return meta;
            }
        };
    }

    public interface Props {
        Integer actual();

        Integer meta();
    }
}
