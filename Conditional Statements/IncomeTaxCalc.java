import java.util.*;
public class IncomeTaxCalc {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Income: ");
    int income = sc.nextInt();

    int Tax=0;

    if (income < 500000)
    {
        System.out.print("Tax Paid: 0");
    }
    else if ( income >= 500000  && income < 1000000)
    {
        System.out.print("Tax Paid: "+(income*0.2));
    }
    else{
        System.out.print("Tax Paid: "+(income*0.3));
    }
 }   
}
