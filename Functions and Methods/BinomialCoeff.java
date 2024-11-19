import java.util.Scanner;

public class BinomialCoeff {

    public static int factorial(int num) {
        int fact = 1;
        if (num == 1 || num == 0) {
            return 1;
        } else {
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            return fact;
        }
    }

    public static int binomCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int result = n_fact / (r_fact * nmr_fact);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = binomCoeff(n, r);
        System.out.print("Binomial Coefficient is :" + res);
    }
}
