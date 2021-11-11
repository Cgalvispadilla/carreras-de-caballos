package com.sofkau.carrerasdecaballos.domain.carril.events;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;

public class CarrilCreado extends DomainEvent {

    private final Caballo caballo;
    private final String juegoID;
    private final boolean estado;
    private final Integer longitudCarrilMetros;

    public CarrilCreado(Caballo caballo, String juegoID, boolean estado, Integer longitudCarrilMetros) {
        super("sofkau.carril.carrilcreated");
        this.caballo = caballo;
        this.juegoID = juegoID;
        this.estado = estado;
        this.longitudCarrilMetros = longitudCarrilMetros;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public String getJuegoID() {
        return juegoID;
    }

    public boolean getEstado() {
        return estado;
    }
}
