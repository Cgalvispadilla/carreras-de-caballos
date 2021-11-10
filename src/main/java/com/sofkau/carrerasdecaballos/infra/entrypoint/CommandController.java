package com.sofkau.carrerasdecaballos.infra.entrypoint;


import com.sofkau.carrerasdecaballos.domain.juego.commands.CrearJuego;
import io.vertx.mutiny.core.eventbus.EventBus;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/api")
public class CommandController {


    private final EventBus bus;

    public CommandController(EventBus bus) {
        this.bus = bus;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/createGame")
    public Response executor(CrearJuego command){
        bus.publish(command.getType(), command);
        return  Response.ok().build();
    }
}
