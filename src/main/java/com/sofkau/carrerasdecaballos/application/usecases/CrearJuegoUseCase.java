package com.sofkau.carrerasdecaballos.application.usecases;


import com.sofkau.carrerasdecaballos.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.domain.carril.Carril;
import com.sofkau.carrerasdecaballos.domain.carril.values.*;
import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.juego.Juego;
import com.sofkau.carrerasdecaballos.domain.juego.Pista;
import com.sofkau.carrerasdecaballos.domain.juego.commands.CrearJuego;

import javax.enterprise.context.Dependent;
import java.util.*;
import java.util.function.Function;

@Dependent
public class CrearJuegoUseCase implements Function<CrearJuego, List<DomainEvent>> {
    private final Set<Integer> generados = new HashSet<>();
    private Set<String> carrilIDS = new HashSet<>();
    private final Random random = new Random();
    private final Map<Integer, String> colores;
    private String juegoID;

    public CrearJuegoUseCase() {
        this.colores = Map.of(
                1, "#000000",
                2, "#FFFFFF",
                3, "#FF0000",
                4, "#00FF00",
                5, "#0000FF",
                6, "#FFFF00",
                7, "#00FFFF",
                8, "#00FFFF",
                9, "#FF00FF",
                10, "#C2C2C2"
        );
        juegoID = UUID.randomUUID().toString();
    }

    private void generadorDeCarriles(int cant, Integer kms) {
        if (cant > 0) {
            for (int i = 0; i < cant; i++) {
                String id = UUID.randomUUID().toString();
                new Carril(id, new Caballo(UUID.randomUUID().toString(),generarColorAleatorio(), (String.valueOf("jugador " + (i + 1)))), juegoID,false, new Posicion(0, (kms * 1000)), (kms * 1000));
                carrilIDS.add(id);

            }
        }
    }

    @Override
    public List<DomainEvent> apply(CrearJuego crearJuego) {
        System.out.println(crearJuego.getJugadores().size()+" "+ crearJuego.getKilometros());
        generadorDeCarriles(crearJuego.getJugadores().size(), crearJuego.getKilometros());
        var juego = new Juego(juegoID, new Pista(crearJuego.getJuegoID(), carrilIDS, crearJuego.getKilometros()),crearJuego.getJugadores());

        crearJuego.getJugadores().forEach((key, value) -> {
            juego.crearJugador(UUID.randomUUID().toString(), value);

        });
        return juego.getUncommittedChanges();
    }

    private String generarColorAleatorio() {
        boolean generado = false;
        int aleatorio = 0;
        while (!generado) {
            int posible = 1 + random.nextInt(9);
            if (!generados.contains(posible)) {
                generados.add(posible);
                aleatorio = posible;
                generado = true;
            }
        }
        if (aleatorio == 0) {
            generados.clear();
            return generarColorAleatorio();
        }

        return colores.get(aleatorio);
    }
}
