package com.sofkau.carrerasdecaballos.domain.carril.events;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.carril.values.Estado;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.values.JuegoID;

public class CarrilCreado extends DomainEvent {

    private final Caballo caballo;
    private final JuegoID juegoID;
    private final Estado estado;
    private final Integer longitudCarrilMetros;

    public CarrilCreado(Caballo caballo, JuegoID juegoID, Estado estado, Integer longitudCarrilMetros) {
        super("sofkau.carril.carrilcreated");
        this.caballo = caballo;
        this.juegoID = juegoID;
        this.estado = estado;
        this.longitudCarrilMetros = longitudCarrilMetros;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public JuegoID getJuegoID() {
        return juegoID;
    }

    public Estado getEstado() {
        return estado;
    }
}
