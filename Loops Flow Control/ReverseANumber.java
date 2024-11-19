
public class ReverseANumber {
    public static void main(String[] args) {
        int num = 25072002;

        // Using While Loop
        // while (num > 0) {
        //     int lastdigit = num % 10;
        //     System.out.print(lastdigit);
        //     num /= 10;
        // }


        // Using for Loop
        int length = Integer.toString(num).length();
        for (int i = 0; i < length; i++) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num /= 10;
        }
    }
}
