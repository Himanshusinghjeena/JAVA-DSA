public class BinarySearch {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) // found
            {
                return mid;
            }
            if (number[mid] < key) // right side
            {
                start = mid + 1;
            } else { // left side
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 12;
        System.out.println("found at index: " + binarySearch(number, key));

    }
}
