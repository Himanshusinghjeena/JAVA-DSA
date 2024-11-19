
public class BinaryToDecimal {
    public static int binToDecimal(int bin_num) {
        int pow = 0;
        int dec_num = 0;
        while (bin_num > 0) {
            int last_digit = bin_num % 10;
            dec_num = dec_num + (last_digit * (int) Math.pow(2, pow));
            pow++;
            bin_num /= 10;
        }
        return dec_num;

    }

    public static void main(String[] args) {
        int n = 1100;
        System.out.println(binToDecimal(n));
    }
}
