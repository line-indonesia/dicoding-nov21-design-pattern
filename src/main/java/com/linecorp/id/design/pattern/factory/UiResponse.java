package com.linecorp.id.design.pattern.factory;

public class UiResponse {
    private final UiType uiType;
    private final String value;

    public UiResponse(UiType uiType, String value) {
        this.uiType = uiType;
        this.value = value;
    }

    public UiType getUiType() {
        return uiType;
    }

    public String getValue() {
        return value;
    }
}
