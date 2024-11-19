import java.util.*;
public class LargestOfThree {
 public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter Second Number: ");
    int num2 = sc.nextInt();

    System.out.print("Enter Third Number: ");
    int num3 = sc.nextInt();

    System.out.println("Three numbers are: "+ num1 + ", " +  num2 + ", "+  num3);


    if (num1 > num2 && num1 > num3)
    {
        System.out.println(num1 + ": is Greater");
    }
    else if (num2 > num3 && num2 > num1)
    {
        System.out.println(num2 + ": is Greater");
    }
    else {
        System.out.println(num3 + ": is Greater");
    }
    }
    
 }   

