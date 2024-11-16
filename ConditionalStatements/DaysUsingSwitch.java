// Write a Java program to input week number (1-7) and print day of week name using switch case

import java.util.*;
public class DaysUsingSwitch {
    public static void main(String[] args) {
        System.out.print("Enter Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1: 
            System.out.print("Sunady");
            break;
            case 2: 
            System.out.print("Monday");
            break;
            case 3: 
            System.out.print("Tuesday");
            break;
            case 4: 
            System.out.print("Thursday");
            break;
            case 5: 
            System.out.print("Friday");
            break;
            case 6: 
            System.out.print("Saturday");
            break;
            default: 
            System.out.print("Select Valid Choice");
            break;
        }
    }
}
