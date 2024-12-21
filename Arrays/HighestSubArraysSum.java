
// Brutee-Force

public class HighestSubArraysSum {
    public static int getSubArraySum(int num[]) {
        int max = -Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(num[k] + " ");
                    sum += num[k];
                }
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }
            }

        }
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        int num[] = { 1,-2,6,-1,3 };
        System.out.println("max: " + getSubArraySum(num));
    }
}
