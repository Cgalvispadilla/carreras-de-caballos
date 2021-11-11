package com.sofkau.carrerasdecaballos.domain.carril;



public class Caballo  {

    protected String caballoID;
    protected String tipo;
    protected String jinete;

    public Caballo(String caballoID, String tipo, String jinete) {
        this.caballoID = caballoID;
        this.tipo = tipo;
        this.jinete = jinete;
    }

    public String getCaballoID() {
        return caballoID;
    }

    public String getTipo() {
        return tipo;
    }

    public String getJinete() {
        return jinete;
    }
}
