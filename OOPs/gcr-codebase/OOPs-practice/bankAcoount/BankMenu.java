package bankAcoount;

// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

class BankMenu {
    public void bankDisplayMenu() {
        BankUtility bankutility = new BankUtility();
        System.out.println("-----------------------------------------");
        System.out.println("WELCOME TO POST BANK");
        System.out.println("-------------------------------------------");

        // int amount=sc.nextInt();

        while (true) {
            System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.GETSTATEMENT");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 5)
                break;

            switch (choice) {
                case 1:
                    bankutility.createAcount();

                    break;
                case 2:
                    System.out.println("enter your deposit amount");
                    double amount = sc.nextDouble();
                    bankutility.deposit(amount);
                    break;
                case 3:
                    System.out.println("enter your withdraw amount");
                    amount = sc.nextDouble();
                    bankutility.withdraw(amount);
                    break;

                case 4:
                    bankutility.getStatement();
                    break;
                default:
                    System.out.println("invalid choice calling ");
                    break;
            }
        }
    }
}