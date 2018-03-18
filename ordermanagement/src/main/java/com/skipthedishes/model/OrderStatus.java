package com.skipthedishes.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

public enum OrderStatus {
    ACKNOWLEDGE("acknowledge"),
    INPROGRESS("inprogress"),
    CANCELLED("cancelled"),
    COMPLETED("completed");

    private final String key;

    OrderStatus(final String key) {
        this.key = key.toLowerCase();
    }

    @JsonCreator
    public static OrderStatus fromString(final String key) {
        return key == null ? null : OrderStatus.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return this.getKey();
    }
}

