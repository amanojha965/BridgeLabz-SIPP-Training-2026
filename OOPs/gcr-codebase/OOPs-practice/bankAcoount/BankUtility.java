package bankAcoount;

import java.util.Scanner;

class BankUtility {
    BankCustomer bankCustomer;

    public void createAcount() {
        Scanner sc = new Scanner(System.in);
        int accountNumber = (int) (Math.random() * 900000) + 100000;
        System.out.println("enter account holder name");
        String name = sc.nextLine();
        double balance = 50000;
        bankCustomer = new BankCustomer(accountNumber, name, balance);

    }

    public void deposit(double amount) {

        if (amount > 0) {
            bankCustomer.balance += amount;
            System.out.println("Deposit successful. New balance: " + bankCustomer.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= bankCustomer.balance) {
            bankCustomer.balance -= amount;
            System.out.println(amount + " withdraw Successful ---balance remaining:-" + bankCustomer.balance);
        } else {
            System.out.println("insufficient balance------ your current balance is " + bankCustomer.balance);
        }
    }

    public void getStatement() {
        System.out.println("Bank Statement:");
        bankCustomer.displayDetails();
    }

}