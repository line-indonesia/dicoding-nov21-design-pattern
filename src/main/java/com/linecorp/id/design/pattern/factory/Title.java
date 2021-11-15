package com.linecorp.id.design.pattern.factory;

public class Title implements UiElement {
    private final String value;

    public Title(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Title with content: " + value;
    }
}
