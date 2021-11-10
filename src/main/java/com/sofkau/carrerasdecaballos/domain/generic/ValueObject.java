package com.sofkau.carrerasdecaballos.domain.generic;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {
    T value();
}
