import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        if (num == 1 || num == 0) {
            return 1;
        } else {
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.print("Factorial of " + num + " is: " + res);
    }
}
