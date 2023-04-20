package com.engeto.restaurant;

public enum Menu {
    FRENCH_FRIES("french fries"), CHICKEN("chicken"), SALMON("salmon"), TROUT("trout");

    private String description;
    Menu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
