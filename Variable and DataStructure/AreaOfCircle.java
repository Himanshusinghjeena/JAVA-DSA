import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius= sc.nextFloat();

        System.out.print("The Area of Circle is: "+ (3.14*radius*radius));
    }
}
