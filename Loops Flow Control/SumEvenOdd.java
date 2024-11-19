// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit: ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            if (lastdigit % 2 == 0) {
                evenSum += lastdigit;
            } else {
                oddSum += lastdigit;
            }
            num /= 10;
        }

        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);
    }
}
