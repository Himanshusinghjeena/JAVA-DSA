// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        String result = num < 0 ? "Negative" : "Positive";

        System.out.print(num + ": is a "+ result + " number.");
    }
}
