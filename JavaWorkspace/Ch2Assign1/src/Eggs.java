//1/24/2024 Jonathan Gregory Chpater 2 Assingment 1
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many eggs did you buy?:");
        int eggs = scanner.nextInt();

        int dozen = eggs / 12;
        int looseEggs = eggs % 12;

        double costOfDozen = dozen * 3.25;
        double costOfLooseEggs = looseEggs * 0.45;
        double totalCost = costOfDozen + costOfLooseEggs;

        System.out.print("You ordered ");
        System.out.print(eggs);
        System.out.print(" eggs. That’s ");
        System.out.print(dozen);
        System.out.print(" dozen at $3.25 per dozen and ");
        System.out.print(looseEggs);
        System.out.print(" loose eggs at 45 cents each for a total of $");
        String totalCostStr = Double.toString(Math.round(totalCost * 100.0) / 100.0);
        System.out.print(totalCostStr);
        System.out.println(".");
    }
}
