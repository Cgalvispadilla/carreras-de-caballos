package com.sofkau.carrerasdecaballos.domain.carril;


import com.sofkau.carrerasdecaballos.domain.carril.events.CaballoDesplazado;
import com.sofkau.carrerasdecaballos.domain.carril.events.CarrilCreado;
import com.sofkau.carrerasdecaballos.domain.generic.EventChange;

public class CarrilEventChange implements EventChange {
    public CarrilEventChange(Carril carril) {
        listener((CarrilCreado event)-> {
            carril.caballo = event.getCaballo();
            carril.juegoID = event.getJuegoID();
            carril.estado = event.getEstado();
        });
        listener((CaballoDesplazado event)->{
            carril.posicion = event.getPosicion();
        });
    }
}
