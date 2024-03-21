package com.example.contactsystem;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    //constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //getters
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}
