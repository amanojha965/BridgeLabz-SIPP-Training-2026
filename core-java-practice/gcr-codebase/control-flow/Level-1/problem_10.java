import java.util.*;

public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double input;

        while (true) {
            input = sc.nextDouble();

            if (input == 0)
                break;

            total += input;
        }

        System.out.println("Total sum is " + total);
    }
}
