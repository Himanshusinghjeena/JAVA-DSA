import java.util.*;

public class CheckEvenOrNot {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        if(isEven(num))
        {
            System.out.print(num+": is Even.");
        }
        else{
            System.out.print(num+": is not an Even.");

        }

    }
}
