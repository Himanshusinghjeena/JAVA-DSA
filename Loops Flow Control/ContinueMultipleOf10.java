import java.util.Scanner;

public class ContinueMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true) { 
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num%10==0)
        {
            continue;
        }
        else{
            System.out.println(num);
        }
    }
    
}
}
