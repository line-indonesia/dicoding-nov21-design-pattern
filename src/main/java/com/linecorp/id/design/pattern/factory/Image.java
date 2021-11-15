package com.linecorp.id.design.pattern.factory;

public class Image implements UiElement {
    private final String value;

    public Image(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Image with url: " + value;
    }
}
