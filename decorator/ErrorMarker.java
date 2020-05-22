package com.codewithmosh.decorator;

public class ErrorMarker implements ArtefactRenderer {

    private ArtefactRenderer artifact;

    public ErrorMarker(ArtefactRenderer artifact) {
        this.artifact = artifact;
    }

    @Override
    public String render() {
        var icon = this.artifact.render();

        return icon + " [Error]";
    }
}
