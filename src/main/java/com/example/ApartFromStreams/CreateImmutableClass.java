package com.example.ApartFromStreams;

public final class CreateImmutableClass {

    private final int id;
    private final String name;

    public CreateImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
