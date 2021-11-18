package com.linecorp.id.design.pattern.di.solution;

public class RemoteContactRepository implements ContactRepository {

    @Override
    public void getListContact() {
        System.out.println("Get contact from API");
    }
}
