//1/24/2024 Jonathan Gregory Chapter 2 Exersize 2 part Two
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of eggs in the order:");
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
        System.out.format("%.2f", totalCost);
        System.out.println(".");
    }
}
