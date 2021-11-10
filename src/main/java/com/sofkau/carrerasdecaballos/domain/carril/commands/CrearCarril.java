package com.sofkau.carrerasdecaballos.domain.carril.commands;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.carril.values.Estado;
import com.sofkau.carrerasdecaballos.domain.generic.Command;
import com.sofkau.carrerasdecaballos.domain.juego.values.JuegoID;

public class CrearCarril extends Command {
    private Caballo caballo;
    private JuegoID juegoID;
    private Estado estado;
    private Integer longitudCarrilMetros;

    public CrearCarril(Caballo caballo, JuegoID juegoID, Estado estado, Integer longitudCarrilMetros) {
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

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    public void setJuegoID(JuegoID juegoID) {
        this.juegoID = juegoID;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
