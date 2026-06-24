import java.util.*;

// student grade system with conditional statements
class Student {
    String name;
    int rollNumber;
    double marks;

    // ----------------------------- Constructor start Syntax-------------------*
    // class ClassName {

    // ClassName() {
    // Constructor code
    // }
    // }

    // ------------defualt Constructor------------------//

    // class Student {

    // Student() {
    // System.out.println("Constructor Called");
    // }
    // }

    // *------------defualt Constructor------------------*

    // ----------------Parameterized Constructor-------------
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }

    // ----------------Parameterized Constructor-------------

    // ---------------------Copy Constructor (Java mein built-in nahi
    // h)---------------

    Student(String name) {
        this.name = name;
        System.out.println("hii 1");

    }

    Student(Student s) {

        this.name = s.name;
        System.out.println("hii 2");
    }

    // ---------------------Copy Constructor (Java mein built-in nahi
    // h)---------------

    // ----------------------------- Constructor end-------------------*

    // method or fuction to display student details

    public void displayDetails() {
        System.out.println("name: " + name + ", Roll_number: " + rollNumber + " , Marks: " + marks);
    }

}

public class printStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Name");
        String name = sc.nextLine();
        System.out.println("Enter your roll_number");
        int rollNumber = sc.nextInt();
        System.out.println("enter your marks");
        double marks = sc.nextDouble();
        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();

        Student student2 = new Student("Aman");
        Student stud3 = new Student(student2);

    }
}
