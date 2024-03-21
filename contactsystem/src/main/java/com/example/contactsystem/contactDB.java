package com.example.contactsystem;
import java.util.*;

public class contactDB {
    // creates a hashmap for efficent storing. ties the name to the contact object.
    private Map<String, Contact> contactsMap = new HashMap<>();

    // adds a name/contact connection into the hashmap
    public void addContact(Contact contact) {
        contactsMap.put(contact.getName(), contact);
    }

    // loops through the contact hashmap and prints out the contact information
    public void printContacts() {
        for (Contact contact : contactsMap.values()) {
            System.out.println(contact);
        }
    }

    // uses the name to to find the contact object in the hashmap and returns the object
    public Contact searchByName(String name) {
        return contactsMap.get(name);
    }

}
