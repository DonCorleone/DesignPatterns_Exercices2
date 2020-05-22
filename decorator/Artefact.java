package com.codewithmosh.decorator;

public class Artefact implements ArtefactRenderer {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
