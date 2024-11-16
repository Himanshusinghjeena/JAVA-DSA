import java.util.Scanner;

public class PassOrFail {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();


       String status=  marks >= 33 ? "Pass" : "Fail";

       System.out.println(status);
   } 
}
