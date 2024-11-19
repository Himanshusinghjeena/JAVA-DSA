import java.util.*;

public class InvertedRotatedHalfPyramid {
    public static void invertedRotatedHalfPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            // for Printing Space's
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // for Printing Stars's
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        invertedRotatedHalfPyramid(row);
    }
}
