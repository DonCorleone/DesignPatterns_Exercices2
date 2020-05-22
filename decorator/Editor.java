package com.codewithmosh.decorator;

public class Editor {
    public void openProject(String path) {
        ArtefactRenderer[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new MainMarker(artefacts[0]);
        artefacts[3] = new ErrorMarker(artefacts[3]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
