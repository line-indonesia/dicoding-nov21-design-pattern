package com.linecorp.id.design.pattern.di.solution;

public class ContactService {
    private ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }
}
