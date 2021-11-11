package com.sofkau.carrerasdecaballos.infra.generic;



import com.sofkau.carrerasdecaballos.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.domain.generic.EventStoreRepository;
import com.sofkau.carrerasdecaballos.domain.generic.StoredEvent;
import com.sofkau.carrerasdecaballos.infra.message.MessageService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public abstract class UseCaseHandle {
    @Inject
    private EventStoreRepository repository;

    @Inject
    private MessageService messageService;;

    public void saveGame(String gameId, List<DomainEvent> events) {
        events.stream().map(event -> {
            String eventBody = EventSerializer.instance().serialize(event);
            return new StoredEvent(event.getClass().getTypeName(), new Date(), eventBody);
        }).forEach(storedEvent -> repository.saveEvent("game", gameId, storedEvent));
        events.forEach(messageService::send);
    }
}
