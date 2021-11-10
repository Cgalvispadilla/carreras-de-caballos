package com.sofkau.carrerasdecaballos.domain.generic;

import java.util.Objects;
import java.util.UUID;

public class Identity implements ValueObject<String>{
    private final String uuid;

    public Identity(String uuid) {
        this.uuid = (String)Objects.requireNonNull(uuid, "Identity can´t be null");
        if (this.uuid.isBlank()) {
            throw new IllegalArgumentException("Identity can´t be blank");
        }
    }

    public Identity() {
        this.uuid = this.generateUUID().toString();
    }

    public UUID generateUUID() {
        return UUID.randomUUID();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object != null && this.getClass() == object.getClass()) {
            Identity identity = (Identity)object;
            return Objects.equals(this.uuid, identity.uuid);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.uuid});
    }

    public String value() {
        return this.uuid;
    }

    public String toString() {
        return this.uuid;
    }
}
