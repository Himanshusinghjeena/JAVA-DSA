public class ArrayQuest2 {
    public static int search(int num[], int target) {
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            // mid == target 
            if (num[mid] == target) {
                return mid;

            } 
            // left array
            else if (num[left] <= num[mid]) {
                // target is in left array
                if (num[left] <= target && target <= num[mid]) {
                    right = mid - 1;
                } 
                // target is in right array
                else {
                    left = mid + 1;
                }
            } 
            // right array
            else {
                // target is in right array
                if (num[mid] <= target && target <= num[right]) {
                    left = mid + 1;
                }
                // target is in left array
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
       System.out.println( search(num, 0));

    }
}
