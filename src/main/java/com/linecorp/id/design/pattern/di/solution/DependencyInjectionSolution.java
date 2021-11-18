package com.linecorp.id.design.pattern.di.solution;

public class DependencyInjectionSolution {
    public void run() {
        Contact remoteContact = new RemoteContact();
        Contact localContact = new LocalContact();
        ContactRepository contactRepository = new ContactRepository(remoteContact, localContact);
        contactRepository.getListContact();
    }
}
