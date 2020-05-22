package com.codewithmosh.decorator;

public class MainMarker implements ArtefactRenderer {

    private ArtefactRenderer artefactRenderer;

    public MainMarker(ArtefactRenderer artefactRenderer) {
        this.artefactRenderer = artefactRenderer;
    }

    @Override
    public String render() {

        var icon = artefactRenderer.render();
        return icon + " [Main]";
    }
}
