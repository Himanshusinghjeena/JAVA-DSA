import java.util.Scanner;

public class ProductOfTwo {
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = product(a, b);
        System.out.print("Product is: " + res);
    }
}
