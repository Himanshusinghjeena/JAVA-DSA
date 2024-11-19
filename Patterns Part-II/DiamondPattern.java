public class DiamondPattern {
    public static void diamondPattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(4);

    }
}
