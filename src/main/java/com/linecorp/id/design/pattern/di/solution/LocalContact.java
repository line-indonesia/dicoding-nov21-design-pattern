package com.linecorp.id.design.pattern.di.solution;

public class LocalContact implements Contact {

    @Override
    public void getListContact() {
        System.out.println("Get contact from local storage");
    }
}
