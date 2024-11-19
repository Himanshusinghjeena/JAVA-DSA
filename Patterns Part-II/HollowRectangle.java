import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Columns: ");
        int col = sc.nextInt();
        hollowRectangle(row, col);
    }
}
