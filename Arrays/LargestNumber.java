import java.util.*;

public class LargestNumber {
    public static int getLargest(int number[]) {
        int largest = -Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 11, 4, 8, 2, 5, 0 };
        int num = getLargest(number);
        System.out.println("largest number is: " + num);
    }
}
