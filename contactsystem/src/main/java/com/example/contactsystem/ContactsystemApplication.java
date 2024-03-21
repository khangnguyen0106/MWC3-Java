package com.example.contactsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContactsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsystemApplication.class, args);
	}

	@Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                contactDB db = new contactDB();
                db.printHelloWorld(); // This will print "Hello World" to the console.
            }
        };
    }

}
