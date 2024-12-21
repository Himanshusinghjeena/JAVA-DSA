import java.util.*;
public class SmallestNumber {
    public static int getSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = { 6, 8, 1, 2, 0, 5, 9, 4 };
        System.out.print("smallest num is: "+getSmallest(number));
        
    }
}
