//1/24/2024 Jonathan Gregory Chapter 2 Assignment 2
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total number of minutes to convert:");
        int minutes = scanner.nextInt();

        double hours = minutes / 60.0;
        double days = minutes / 1440.0;

        String result = minutes + " minutes equals " + hours + " hours and " + days + " days.";
        System.out.println(result);
    }
}

