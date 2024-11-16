import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNum = sc.nextInt();

        if(firstNum > secondNum){
            System.out.print("firstNumber: " + firstNum + " is Greater");
        }
        else{
            System.out.print("secondNumber: " + secondNum + " is Greater");
        }
        
    }
    
}
