public class HollowRhombus {
    public static void hollowRhombus(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);

    }
}
