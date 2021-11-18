package com.linecorp.id.design.pattern.di.solution;

public class ContactRepository {

    private Contact remoteContact;
    private Contact localContact;

    public ContactRepository(Contact remoteContact, Contact localContact) {
        this.remoteContact = remoteContact;
        this.localContact = localContact;
    }

    public void getListContact() {
        remoteContact.getListContact();
        localContact.getListContact();
    }
}
