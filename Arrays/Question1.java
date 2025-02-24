
// Question 1: Given an integer array nums, return true if any value appears at least twice in thearray, and return false
//  if every element is distinct.

// Example 1:
// Input: nums = [1, 2, 3, 1]
// Output: true

// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false

// Example 3:
// Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output: true

import java.util.HashSet;

public class Question1 {
    public static boolean hasDuplicate(int num[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                return true;
            }
            set.add(num[i]);

        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(hasDuplicate(nums));
    }
}
