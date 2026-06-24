package EmployeePayrollSystem;

import java.rmi.server.SocketSecurityException;

public class EmployeeMain {
    public static void main(String[] args) {

        FulltimeEmployee fte = new FulltimeEmployee();

        fte.setEmployeeName("Aman");
        fte.setEmployeeId(101);

        fte.setMonthlySalary(50000);

        fte.displayEmployeeInfo();
        System.out.println("Salary: " + fte.calculateSalary());

        System.out.println("-------------------");
        PartTimeEmployee pte = new PartTimeEmployee();

        pte.setEmployeeId(112);
        pte.setEmployeeName("mayank");
        pte.setHourlyRate(120);
        pte.setHoursWorked(200);

        pte.displayEmployeeInfo();

        System.out.println("Salary of partTime: " + pte.calculateSalary());
    }
}
