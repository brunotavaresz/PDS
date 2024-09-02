package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda implements ContactsInterface{

    List<Contact> contacts;
    ContactsStorageInterface store;

    public void openAndLoad(ContactsStorageInterface store) {
        this.store = store;
        contacts = new ArrayList<>();
        for (Contact c : store.loadContacts()) {
            contacts.add(c);
            System.out.println(c);
        }
    }

    public void saveAndClose() {
        if (!this.store.saveContacts(contacts)) {
            System.out.println("Error saving contacts");
        } else {
            System.out.println("Contacts saved successfully");
        }
    }

    public void saveAndClose(ContactsStorageInterface store) {
        if (!store.saveContacts(contacts)) {
            System.out.println("Error saving contacts");
        } else {
            System.out.println("Contacts saved successfully");
        }
    }

    public boolean exist(Contact contact) {
        for (Contact c : contacts) {
            if (c.getName().equals(contact.getName())) {
                return true;
            }
        }
        return false;
    }

    public Contact getByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public boolean add(Contact contact) {
        if (exist(contact)) {
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean remove(Contact contact) {
        if (!exist(contact)) {
            return false;
        }
        contacts.remove(contact);
        return true;
    }
}
