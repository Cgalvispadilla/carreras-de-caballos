package com.sofkau.carrerasdecaballos.domain.juego;



import java.util.Set;

public class Pista {
    protected String pistaID;
    protected Set<String> carrilesID;
    protected int kilometros;

    public Pista(String pistaID, Set<String> carrilesID, int kilometros) {
        this.pistaID = pistaID;
        this.carrilesID = carrilesID;
        this.kilometros = kilometros;
    }

    public Set<String> obtenerCarriles() {
        return carrilesID;
    }

    public void asignarCarriles(Set<String> carriles) {
        this.carrilesID = carriles;
    }

    public int obtenerKilometros() {
        return kilometros;
    }

    public void asignarKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
