package com.sofkau.carrerasdecaballos.domain.carril.events;


import com.sofkau.carrerasdecaballos.domain.carril.values.Posicion;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class CaballoDesplazado extends DomainEvent {

    private final Posicion posicion;

    public CaballoDesplazado(Posicion posicionDeAvance) {
        super("carril.CaballoDesplazado");
        this.posicion = posicionDeAvance;
    }

    public Posicion getPosicion() {
        return posicion;
    }
}
