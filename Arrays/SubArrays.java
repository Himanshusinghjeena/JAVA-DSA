public class SubArrays {
    public static int getSubArray(int num[]) {
        int totalSubArrays = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");

                }
                totalSubArrays++;
                System.out.println();
            }
        }
        return totalSubArrays;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };

        System.out.println("total sub Arrays: " + getSubArray(num));
    }
}