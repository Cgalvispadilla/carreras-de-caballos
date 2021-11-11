package com.sofkau.carrerasdecaballos.domain.carril;



public class Caballo  {

    protected String caballoID;
    protected String jinete;

    public Caballo(String caballoID, String jinete) {
        this.caballoID = caballoID;
        this.jinete = jinete;
    }

    public String getCaballoID() {
        return caballoID;
    }


    public String getJinete() {
        return jinete;
    }
}
