import java.util.Scanner;

public class ButterflyPattern {
    public static void butterflyPattern(int row) {
        for (int i = 1; i <= row; i++) {
            // Star 1
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space
            for (int space = 1; space <= 2 * (row - i); space++) {
                System.out.print("  ");
            }
            // Star 2
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            // Star 1
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space
            for (int space = 1; space <= 2 * (row - i); space++) {
                System.out.print("  ");
            }
            // Star 2
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        butterflyPattern(row);
    }
}
