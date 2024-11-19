// Write a program to nd the factorial of any number entered by the user.

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int fact = 1;

        if (num == 1 || num == 0) {
            System.out.print("Factorial of " + num + " is: " + "1");
        } else {
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            System.out.print("Factorial of " + num + " is: " + fact);
        }

    }
}
