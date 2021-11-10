package com.sofkau.carrerasdecaballos.domain.juego.commands;


import com.sofkau.carrerasdecaballos.domain.generic.Command;
import com.sofkau.carrerasdecaballos.domain.juego.values.JugadorID;
import com.sofkau.carrerasdecaballos.domain.juego.values.Nombre;

public class CrearJugador extends Command {
    private JugadorID entityId;
    private Nombre nombre;

    public CrearJugador(JugadorID entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public JugadorID getEntityId() {
        return entityId;
    }

    public void setEntityId(JugadorID entityId) {
        this.entityId = entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
