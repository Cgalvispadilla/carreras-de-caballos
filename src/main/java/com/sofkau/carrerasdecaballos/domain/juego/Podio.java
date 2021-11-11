package com.sofkau.carrerasdecaballos.domain.juego;

public class Podio {

    protected Jugador firstPlace;
    protected String secondPlace;
    protected String thirdPlace;

    public Podio(){

    }
    public Podio(Jugador firstPlace, String secondPlace, String thirdPlace) {
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
    }

    public Jugador getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(Jugador firstPlace) {
        this.firstPlace = firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public String getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
