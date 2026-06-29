import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

public class AddressBook {
    static ArrayList<Contacts> contactsList = new ArrayList<>();
    static HashMap<String, Contacts> contactsMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public void addContact(String name, String phoneNumber, String email) {
        Contacts user = new Contacts(name, phoneNumber, email);
        if (!phoneNumbers.contains(phoneNumber)) {
            contactsList.add(user);
            contactsMap.put(name, user);
            phoneNumbers.add(phoneNumber);
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact with this phone number already exists.");
        }
    }

    public void searchContact(String name) {
        Contacts contact = contactsMap.get(name);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        Contacts contact = contactsMap.get(name);
        if (contact != null) {
            contactsList.remove(contact);
            contactsMap.remove(name);
            phoneNumbers.remove(contact.getPhoneNumber());
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts() {
        Collections.sort(contactsList);
        if (contactsList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contacts c : contactsList) {
                System.out.println(c);
            }
        }
    }
}
