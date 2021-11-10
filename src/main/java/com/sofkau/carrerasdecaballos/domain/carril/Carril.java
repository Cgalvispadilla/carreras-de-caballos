package com.sofkau.carrerasdecaballos.domain.carril;



import com.sofkau.carrerasdecaballos.domain.carril.events.CaballoDesplazado;
import com.sofkau.carrerasdecaballos.domain.carril.events.CarrilCreado;
import com.sofkau.carrerasdecaballos.domain.carril.values.CarrilID;
import com.sofkau.carrerasdecaballos.domain.carril.values.Estado;
import com.sofkau.carrerasdecaballos.domain.carril.values.Posicion;
import com.sofkau.carrerasdecaballos.domain.generic.AggregateRoot;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.values.JuegoID;

import java.util.List;

public class Carril extends AggregateRoot {

    protected Caballo caballo;
    protected JuegoID juegoID;
    protected Estado estado;
    protected Posicion posicion;
    protected Integer longitudCarrilMetros;

    private Carril(CarrilID carrilID){
        super(carrilID.value());
        subscribe(new CarrilEventChange(this));
    }

    public Carril(CarrilID carrilID, Caballo caballo, JuegoID juegoID, Estado estado, Posicion posicion, Integer longitudCarrilMetros) {
        super(carrilID.value());
        this.caballo = caballo;
        this.juegoID = juegoID;
        this.estado = estado;
        this.posicion = posicion;
        this.longitudCarrilMetros = longitudCarrilMetros;
        subscribe(new CarrilEventChange(this));
        appendChange(new CarrilCreado(caballo, juegoID, estado, longitudCarrilMetros), juegoID.value()).apply();
    }

    public static Carril from(CarrilID carrilID, List<DomainEvent> eventList) {
        var carril = new Carril(carrilID);
        eventList.forEach(carril::applyEvent);
        return carril;
    }

    public void MoverCaballo(Integer distancia, JuegoID juegoID){
        appendChange(new CaballoDesplazado(new Posicion(distancia,longitudCarrilMetros())),juegoID.value()).apply();
    }

    public Integer longitudCarrilMetros(){
        return longitudCarrilMetros;
    }

    public Integer posicionActual() {
        return posicion.value().actual();
    }

    public Integer posicionDeseada() {
        return posicion.value().meta();
    }

    public Boolean estado() {
        return estado.value();
    }

}
