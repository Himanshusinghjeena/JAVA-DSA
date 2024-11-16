// In a program , input the side of a square.You have to output the area of the square

import java.util.*;
public class AreaOfSquare {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Side: ");
        int side=sc.nextInt();

        System.out.print("Area of Square of Side "+  side + " is: "+(side*side));
    }
    
}
