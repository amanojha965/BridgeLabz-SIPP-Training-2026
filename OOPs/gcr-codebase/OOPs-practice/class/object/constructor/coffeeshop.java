import java.util.Scanner;

class CoffeeShopOrder {
    // attributes

    String customerName;
    String coffeeType;
    int Quantity;
    double totalPrice;

    // default constructor

    CoffeeShopOrder() {
        customerName = "guest";
        coffeeType = "regular";
        Quantity = 1;
        totalPrice = 1200.00;
    }

    // Parameterized Constructor

    CoffeeShopOrder(String customerName, String coffeeType, int Quantity) {
        this.customerName = customerName;
        this.coffeeType = coffeeType;
        this.Quantity = Quantity;

    }

    // copy constructor

    CoffeeShopOrder(CoffeeShopOrder previousOrder) {
        this.customerName = previousOrder.customerName;
        this.coffeeType = previousOrder.coffeeType;
        this.Quantity = previousOrder.Quantity;
    }

    // method to calculate price

    public double calculatePrice() {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        double pricePerCup= switch(coffeeType.toLowerCase()){
            case "latte"->5.0;
            case "espresso" ->4.0;
            case "cappuccino"->4.5;
            default ->3.0 // regular office 
        }
    }

}

public class coffeeshop {

    Scanner sc = new Scanner(System.in);

}
