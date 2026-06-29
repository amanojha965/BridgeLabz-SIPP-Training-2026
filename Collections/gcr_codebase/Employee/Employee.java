package Employee;

public class Employee {
    private int ID;
    private String name;
    private String phoneNumber;
    private String email;
    private String Department;

    public Employee(int ID, String name, String phoneNumber, String email, String Department) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.Department = Department;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return Department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
