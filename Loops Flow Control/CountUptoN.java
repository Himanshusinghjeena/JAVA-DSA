import java.util.Scanner;
public class CountUptoN {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num= sc.nextInt();
    int i=0;
    int sum=0;
    while (i<=num) { 
        sum=sum+i;
        i++;
    }
    System.out.print("The Sum is: "+ sum);
 }   
}
