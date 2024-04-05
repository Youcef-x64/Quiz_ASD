package org.example;

import org.example.model.Contact;
import org.example.model.Email;
import org.example.model.Label;
import org.example.model.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // David
        List<Phone> phones1 = new ArrayList<>();

        phones1.add(new Phone("240-133-0011", Label.HOME));
        phones1.add(new Phone("240-112-0123", Label.MOBILE));

        List<Email> emails1 = new ArrayList<>();

        emails1.add(new Email("dave.sang@gmail.com", Label.HOME));
        emails1.add(new Email("dsanger@argos.com", Label.WORK));

        List<Contact> contacts = new ArrayList<>();

        contacts.add(
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager"
                        , phones1, emails1));

        // Carlos
        List<Phone> phones2 = new ArrayList<>();

        phones2.add(new Phone("412-116-9988", Label.MOBILE));

        contacts.add(
                new Contact("Carlos", "Jimenez", null, null
                        , phones2, null));

        // Ali
        List<Email> emails3 = new ArrayList<>();

        emails3.add(new Email("ali@bmi.com", Label.WORK));

        contacts.add(
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager"
                        , null, emails3));

        // Sort
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Print Json Format
        StringBuilder contactsStrBuilder = new StringBuilder();

        Contact contact;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);

            contactsStrBuilder.append(contact.toJson());

            if (i != contacts.size() - 1)
                contactsStrBuilder.append(",\n");
        }

        System.out.println("[" + contactsStrBuilder.toString() + "]");
    }
}