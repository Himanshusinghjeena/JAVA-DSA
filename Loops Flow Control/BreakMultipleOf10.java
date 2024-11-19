//  Keep Entering until user input multiple of 10

import java.util.Scanner;

public class BreakMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true) { 
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num%10==0)
        {
            break;
        }
    }
    System.out.print("You Entered the Multiple of 10");
}
}
