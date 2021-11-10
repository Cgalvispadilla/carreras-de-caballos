package com.sofkau.carrerasdecaballos.infra.materialize;

import com.mongodb.client.MongoClient;
import com.sofkau.carrerasdecaballos.domain.juego.events.JuegoCreado;
import io.quarkus.vertx.ConsumeEvent;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

public class ProgramHandle {
    private final MongoClient mongoClient;

    public ProgramHandle(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }


    @ConsumeEvent(value = "juego.jugardorcreado")
    void consumeProgramCreated(JuegoCreado event) {
        Map<String, Object> document = new HashMap<>();
        document.put("_id", event.getAggregateId());
        document.put("pista", event.getPista());

        mongoClient.getDatabase("queries")
                .getCollection("game")
                .insertOne(new Document(document));
    }
}
