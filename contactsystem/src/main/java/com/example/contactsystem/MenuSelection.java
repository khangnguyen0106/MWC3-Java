package com.example.contactsystem;
import java.util.Scanner;

public class MenuSelection {
	
	public void startMenu(String[] args) {
		int userSelected;
        contactDB cd = new contactDB();

		do {
			userSelected = MenuData();
			switch (userSelected) {
				case 1:
                    System.out.println ("Option 1 - 'Add a new contact' is selected.");
                    cd.addContact(new Contact("John Doe", "1234567890", "johndoe@example.com"));
					break;
				case 2:
                    System.out.println ("Option 2 - 'Search up a contact' is selected.");
					break;
				case 3:
                    System.out.println ("Option 3 - 'Print all contacts' is selected.");
					break;
                default:
                    break;
			}
		}
        while (userSelected != 0);
	}

    public static int MenuData() {
        int selection;
        Scanner option = new Scanner (System.in);
        System.out.println ("Select your option: ");
        System.out.println ("-------------------\n");
        System.out.println ("0 - Exit");
        System.out.println ("1 - Add a new contact ");
        System.out.println ("2 - Search up a contact");
        System.out.println ("3 - Print all contacts");

        System.out.println ("You selected: ");
        selection = option.nextInt();
        return selection;

    }
}