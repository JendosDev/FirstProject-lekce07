package com.engeto.restaurant;

public enum Category {
    CHICKEN("chicken"), PASTA("pasta"), FISH("fish"),
    PIZZA("pizza"), ATTACHMENT("attachment"), SWEET("sweet");

    private String description;
    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
