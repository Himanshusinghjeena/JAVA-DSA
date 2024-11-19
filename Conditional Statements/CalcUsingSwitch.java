import java.util.*;

public class CalcUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Operation: ");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.print("Addition: " + (num1 + num2));
                break;
            case "-":
                System.out.print("Subtraction: " + (num1 - num2));
                break;
            case "*":
                System.out.print("Multiplication: " + (num1 * num2));
                break;
            case "/":
                System.out.print("Division: " + (num1 / num2));
                break;
            case "%":
                System.out.print("Modolus: " + (num1 % num2));
                break;
            default:
                System.out.print("Enter Correct Option");
        }
    }
}
