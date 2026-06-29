package Employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        EmployeeApi employeeApi = new EmployeeApi();

        // Sample Data
        employeeApi.addContact(1, "Aman", "1234567890", "Aman@gmail.com", "IT");
        employeeApi.addContact(2, "Raman", "0987654321", "raman@gmail.com", "HR");
        employeeApi.addContact(3, "Ravi", "2233445566", "Ravi@gmail.com", "HR");
        employeeApi.addContact(4, "Karan", "1122334455", "karan@gmail.com", "IT");
        employeeApi.addContact(5, "Suresh", "9988776655", "Suresh@gmail.com", "Finance");
        employeeApi.addContact(6, "Amit", "8877665544", "Amit@gmail.com", "Marketing");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Contact Management =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact by Department");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.println("\nSelect Department:");
                    System.out.println("1. IT");
                    System.out.println("2. HR");
                    System.out.println("3. Finance");
                    System.out.println("4. Marketing");
                    System.out.print("Enter Department Choice: ");

                    int deptChoice = sc.nextInt();
                    sc.nextLine();

                    String department;

                    switch (deptChoice) {
                        case 1:
                            department = "IT";
                            break;
                        case 2:
                            department = "HR";
                            break;
                        case 3:
                            department = "Finance";
                            break;
                        case 4:
                            department = "Marketing";
                            break;
                        default:
                            System.out.println("Invalid Department!");
                            continue;
                    }

                    employeeApi.addContact(id, name, phone, email, department);
                    break;

                case 2:
                    System.out.print("Enter Department to Search: ");
                    String dept = sc.nextLine();

                    employeeApi.searchContact(dept);
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}