// In a program,input 3 numbers : A, B and C.You have to output the average of these 3 numbers.


import java.util.*;
public class AverageOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        int num3 = sc.nextInt();

        System.out.print("The Average of "+ num1 + ", " + num2+ ", "+num3+ " is: "+((num1+num2+num3)/3));
    }
}
