package com.linecorp.id.design.pattern.di.solution;

public class RemoteContact implements Contact {

    @Override
    public void getListContact() {
        System.out.println("Get contact from API");
    }
}
