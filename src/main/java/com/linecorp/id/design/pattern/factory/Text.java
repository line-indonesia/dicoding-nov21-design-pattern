package com.linecorp.id.design.pattern.factory;

public class Text implements UiElement {
    private final String value;

    public Text(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Text with content: " + value;
    }
}
