package com.sofkau.carrerasdecaballos.infra.handle;

import com.sofkau.carrerasdecaballos.application.usecases.CrearJuegoUseCase;
import com.sofkau.carrerasdecaballos.domain.juego.commands.CrearJuego;
import com.sofkau.carrerasdecaballos.infra.generic.UseCaseHandle;
import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CrearJuegoUseCaseHandle extends UseCaseHandle {
    private final CrearJuegoUseCase crearJuegoUseCase;

    public CrearJuegoUseCaseHandle(CrearJuegoUseCase crearJuegoUseCase) {
        this.crearJuegoUseCase = crearJuegoUseCase;
    }

    @ConsumeEvent(value = "sofka.carreras.crearCarrera", blocking = true)
    void consumeNoBlocking(CrearJuego command){
        var events = crearJuegoUseCase.apply(command);
        command.setJuegoId(command.getJuegoId());
        System.out.println(command.getJuegoId());
        saveGame(command.getJuegoId(), events);
    }
}
