package com.linecorp.id.design.pattern.factory.solution;

import com.linecorp.id.design.pattern.factory.*;

import java.util.ArrayList;
import java.util.List;

public class FactorySolution {

    public void run() {
        // suppose we have a dynamic promo page, where admin can set the promo page layout in the backend
        List<UiResponse> responses = new ArrayList<>();
        responses.add(new UiResponse(UiType.TITLE, "Welcome to LINE"));
        responses.add(new UiResponse(UiType.IMAGE, "https://id.wikipedia.org/wiki/Berkas:LINE_logo.svg"));
        responses.add(new UiResponse(UiType.TEXT, "LINE is a fun messenger built for you"));

        // how to render the settings from server into a UI object in client?
        List<UiElement> uiElements = new ArrayList<>();

        UiFactory factory = new UiFactory();
        for (UiResponse response : responses) {
            UiElement element = factory.getUiElement(response);
            uiElements.add(element);
        }

        for (UiElement element : uiElements) {
            System.out.println(element);
        }
    }

    class UiFactory {
        public UiElement getUiElement(UiResponse response) {
            switch (response.getUiType()) {
                case IMAGE: return new Image(response.getValue());
                case TEXT: return new Text(response.getValue());
                case TITLE: return new Title(response.getValue());
            }
            throw new IllegalArgumentException(("Unknown UI Type"));
        }
    }
}