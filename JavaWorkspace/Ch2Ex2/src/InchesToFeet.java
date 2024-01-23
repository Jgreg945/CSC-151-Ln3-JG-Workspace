//1/22/2024 Jonathan Gregory Chapter 2 Exersize 2 part One
public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 86;
        final int inch2Foot = 12;
        int feet = inches / inch2Foot;
        int remainder = inches % inch2Foot;
        System.out.println(inches + " inches is " + feet + " feet and " + remainder + " inches.");
    }
}
