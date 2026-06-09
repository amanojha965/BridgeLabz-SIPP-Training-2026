
public class problem_4 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) profit / costPrice * 100;

        System.out.println("The Cost Price: " + costPrice + " Selling Price:  " + sellingPrice +
                "\n Profit: " + profit + " Profit Percentage: " + profitPercentage);
    }

}
