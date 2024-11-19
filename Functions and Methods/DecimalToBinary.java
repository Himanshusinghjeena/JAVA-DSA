
public class DecimalToBinary {
    public static int decToBinary(int dec_num) {
        int bin_num = 0;
        int pow = 0;
        while (dec_num > 0) {
            int rem = dec_num % 2;
            bin_num = bin_num + (rem * (int) Math.pow(10, pow));
            pow++;
            dec_num /= 2;
        }
        return bin_num;
    }

    public static void main(String[] args) {
        System.out.println(decToBinary(12));
      
    }

}
