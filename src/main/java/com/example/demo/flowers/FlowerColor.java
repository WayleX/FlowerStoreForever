package com.example.demo.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    @JsonValue
    public String toString() {
        return stringRepresentation;
    }
    @JsonValue
    public String getValue() {
        return stringRepresentation;
    }
}
