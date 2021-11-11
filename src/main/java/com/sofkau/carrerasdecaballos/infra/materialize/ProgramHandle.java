package com.sofkau.carrerasdecaballos.infra.materialize;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.sofkau.carrerasdecaballos.domain.juego.events.JuegoCreado;
import com.sofkau.carrerasdecaballos.domain.juego.events.JugadorCreado;
import io.quarkus.vertx.ConsumeEvent;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

public class ProgramHandle {
    private final MongoClient mongoClient;

    public ProgramHandle(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }


    @ConsumeEvent(value = "juego.juegocreado")
    void consumeProgramCreated(JuegoCreado event) {
        Map<String, Object> document = new HashMap<>();
        Map<String, Object> pista = new HashMap<>();
        pista.put("pistaID", event.getPista().pistaID());
        pista.put("kilometros",event.getPista().obtenerKilometros());
        pista.put("carrilesID",event.getPista().obtenerCarriles());
        document.put("_id", event.getAggregateId());
        document.put("pista", pista);

        mongoClient.getDatabase("queries")
                .getCollection("game")
                .insertOne(new Document(document));
    }

   /* @ConsumeEvent(value = "juego.juegocreado")
    void consumeProgramCreatedForCreateGamer(JuegoCreado event) {
        Map<String, Object> document = new HashMap<>();
        Document = event.
    }*/

    @ConsumeEvent(value = "juego.JugadorCreado")
    void consumePlayerCreated(JugadorCreado event) {
        BasicDBObject basicDBObject = new BasicDBObject();

    }
}
