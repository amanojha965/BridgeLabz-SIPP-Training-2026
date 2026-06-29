package Employee;

import java.util.ArrayList;
import java.util.HashSet;

public class EmployeeApi {
    static ArrayList<Employee> contactsList = new ArrayList<>();

    static HashSet<String> phoneNumbers = new HashSet<>();

    public void addContact(int ID, String name, String phoneNumber, String email, String Department) {
        Employee user = new Employee(ID, name, phoneNumber, email, Department);
        if (!phoneNumbers.contains(phoneNumber)) {
            contactsList.add(user);
            phoneNumbers.add(phoneNumber);
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact with this phone number already exists.");
        }
    }

    public void searchContact(String Department) {
        for (Employee contact : contactsList) {
            if (contact.getDepartment().equalsIgnoreCase(Department)) {
                System.out.println(contact);
            }
        }

    }
}
