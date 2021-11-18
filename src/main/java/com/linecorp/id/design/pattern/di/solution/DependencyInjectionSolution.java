package com.linecorp.id.design.pattern.di.solution;

public class DependencyInjectionSolution {
    public void run() {
        ContactRepository contactRepository = new LocalContactRepository();
        ContactService contactService = new ContactService(contactRepository);
        ProfileService profileService = new ProfileService(contactRepository);
    }
}
