package com.sofkau.carrerasdecaballos.domain.juego;


import com.sofkau.carrerasdecaballos.domain.carril.values.CarrilID;
import com.sofkau.carrerasdecaballos.domain.generic.Entity;
import com.sofkau.carrerasdecaballos.domain.juego.values.Kilometros;
import com.sofkau.carrerasdecaballos.domain.juego.values.PistaID;

import java.util.Set;

public class Pista extends Entity<PistaID> {
    protected Set<CarrilID> carriles;
    protected Kilometros kilometros;

    public Pista(PistaID entityId, Set<CarrilID> carriles, Kilometros kilometros) {
        super(entityId);
        this.carriles = carriles;
        this.kilometros = kilometros;
    }

    public Set<CarrilID> obtenerCarriles() {
        return carriles;
    }

    public void asignarCarriles(Set<CarrilID> carriles) {
        this.carriles = carriles;
    }

    public Kilometros obtenerKilometros() {
        return kilometros;
    }

    public void asignarKilometros(Kilometros kilometros) {
        this.kilometros = kilometros;
    }
}
