package com.linecorp.id.design.pattern.di.solution;

public class ProfileService {
    private ContactRepository repository;

    public ProfileService(ContactRepository repository) {
        this.repository = repository;
    }
}
