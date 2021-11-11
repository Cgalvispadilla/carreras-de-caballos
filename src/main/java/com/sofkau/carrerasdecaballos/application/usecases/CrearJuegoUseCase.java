package com.sofkau.carrerasdecaballos.application.usecases;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.carril.Carril;
import com.sofkau.carrerasdecaballos.domain.carril.values.Posicion;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Juego;
import com.sofkau.carrerasdecaballos.domain.juego.Pista;
import com.sofkau.carrerasdecaballos.domain.juego.commands.CrearJuego;

import javax.enterprise.context.Dependent;
import java.util.*;
import java.util.function.Function;

@Dependent
public class CrearJuegoUseCase implements Function<CrearJuego, List<DomainEvent>> {
    private Set<String> carrilIDS = new HashSet<>(Arrays.asList("2","3"));


    private void generadorDeCarriles(int cant, Integer kms, String juegoID) {
        if (cant > 0) {
            for (int i = 0; i < cant; i++) {
                new Carril(String.valueOf((i+1)), new Caballo(String.valueOf((i+1)), (String.valueOf("jugador " + (i + 1)))), juegoID, false, new Posicion(0, (kms * 1000)), (kms * 1000));
                carrilIDS.add(String.valueOf((i+1)));
            }
        }
    }

    @Override
    public List<DomainEvent> apply(CrearJuego crearJuego) {
        System.out.println(crearJuego.getJuegoId());
        System.out.println(crearJuego.getJugadores().size() + " " + crearJuego.getKilometros());
       generadorDeCarriles(crearJuego.getJugadores().size(), crearJuego.getKilometros(), crearJuego.getJuegoId());
        var juego = new Juego(crearJuego.getJuegoId(), new Pista(crearJuego.getJuegoId(), carrilIDS, crearJuego.getKilometros()));
        crearJuego.getJugadores().forEach((key, value) -> {
            juego.crearJugador(key,value );
        });
        return juego.getUncommittedChanges();
    }


}
