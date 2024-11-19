import java.util.Scanner;

public class SumOfTwo {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = sum(a, b);
        System.out.print("sum is: " + res);
    }
}
