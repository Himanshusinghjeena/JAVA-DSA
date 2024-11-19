import java.util.*;
public class whileLoop1ToN {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number Upto Which You Want Print: ");
    int num = sc.nextInt();

    int count = 1;
    while(count<=num){
        System.out.println(count);
        count++;
    }
 }   
}
