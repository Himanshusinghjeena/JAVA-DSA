
public class OddAndEven {
    public static void isEvenorOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        isEvenorOdd(11);
        isEvenorOdd(6);
        isEvenorOdd(21);

    }
}
