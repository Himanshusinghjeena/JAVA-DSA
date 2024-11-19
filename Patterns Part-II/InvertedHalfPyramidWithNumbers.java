import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void invertedHalfPyramidWithNumbers(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        invertedHalfPyramidWithNumbers(row);
    }
}
