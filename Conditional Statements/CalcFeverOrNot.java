// You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class CalcFeverOrNot {
 public static void main(String[] args) {
    System.out.print("Enter Temperature: ");
    Scanner sc = new Scanner(System.in);

    double temp = sc.nextDouble();

    String result = temp >=100 ? "You have a Fever" : "You don't have a Fever"; 
    System.out.print(result);
    
 }    
}
