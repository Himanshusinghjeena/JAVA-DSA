
import java.util.*;
public class ProductOfTwo {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter First Number: ");
        int firstNum= sc.nextInt();

        System.out.print("Enter Sceond Number: ");
        int secondNum = sc.nextInt();

        System.out.print("The Product of " + firstNum + " And " + secondNum + " is: "+ (firstNum*secondNum));
       
    }
}
