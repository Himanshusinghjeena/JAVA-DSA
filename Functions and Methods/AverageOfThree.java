// Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class AverageOfThree {
    public static int averageOfThree(int a, int b, int c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2= sc.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();
        System.out.println("Average of "+num1+", "+num2+ ", "+num3+" is: "+ averageOfThree(num1, num2, num3));
    }
}
