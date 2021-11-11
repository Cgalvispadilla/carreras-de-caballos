package com.sofkau.carrerasdecaballos.domain.carril.commands;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.generic.Command;

public class CrearCarril extends Command {
    private Caballo caballo;
    private String juegoID;
    private boolean estado;
    private Integer longitudCarrilMetros;

    public CrearCarril(Caballo caballo, String juegoID, boolean estado, Integer longitudCarrilMetros) {
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

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    public void setJuegoID(String juegoID) {
        this.juegoID = juegoID;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
