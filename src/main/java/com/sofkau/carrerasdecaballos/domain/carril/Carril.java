package com.sofkau.carrerasdecaballos.domain.carril;



import com.sofkau.carrerasdecaballos.domain.carril.events.CaballoDesplazado;
import com.sofkau.carrerasdecaballos.domain.carril.events.CarrilCreado;
import com.sofkau.carrerasdecaballos.domain.carril.values.Posicion;
import com.sofkau.carrerasdecaballos.domain.generic.AggregateRoot;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.generic.EventChange;


import java.util.List;

public class Carril extends AggregateRoot implements EventChange {


    protected Caballo caballo;
    protected String juegoID;
    protected boolean estado;
    protected Posicion posicion;
    protected Integer longitudCarrilMetros;

    private Carril(String carrilID){
        super(carrilID);
        subscribe(new CarrilEventChange(this));
    }

    public Carril(String carrilID, Caballo caballo, String juegoID, boolean estado, Posicion posicion, Integer longitudCarrilMetros) {
        super(carrilID);
        this.caballo = caballo;
        this.juegoID = juegoID;
        this.estado = estado;
        this.posicion = posicion;
        this.longitudCarrilMetros = longitudCarrilMetros;
        subscribe(new CarrilEventChange(this));
        appendChange(new CarrilCreado(caballo, juegoID, estado, longitudCarrilMetros), juegoID).apply();
    }

    public static Carril from(String carrilID, List<DomainEvent> eventList) {
        var carril = new Carril(carrilID);
        eventList.forEach(carril::applyEvent);
        return carril;
    }

    public void MoverCaballo(Integer distancia, String juegoID){
        appendChange(new CaballoDesplazado(new Posicion(distancia,longitudCarrilMetros())),juegoID).apply();
    }

    public Integer longitudCarrilMetros(){
        return longitudCarrilMetros;
    }

    public Integer posicionActual() {
        return posicion.getPosActual();
    }

    public Integer posicionDeseada() {
        return posicion.getMeta();
    }

    public Boolean estado() {
        return estado;
    }

}
