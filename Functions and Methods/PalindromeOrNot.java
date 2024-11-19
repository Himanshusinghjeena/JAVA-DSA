// Write a Java program to check if a number is a palindrome in Java ? (121 is a palindrome, 321 is not)A number is called a palindrome
// if the number is equal to the reverse of a number.

import java.util.Scanner;

public class PalindromeOrNot {
    public static int isPalindrome(int num) {
        int rev = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        int reverse = isPalindrome(num);
        if (reverse == num) {
            System.out.print(num + ": is a Palindrome");
        } else {
            System.out.print(num + ": is not a Palindrome");
        }
    }
}
