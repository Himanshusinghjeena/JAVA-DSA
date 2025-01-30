public class CountingSortAlgo {
    public static void getCountingSort(int arr[]) {

        int max = Integer.MIN_VALUE;

        // Find array maximum element
        for (int i = 0; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
            

        int count[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = 
        // { 0, 1, 4, 1, 3, 2, 4, 3, 7, 9 };
        {100, 108, 108, 104, 106, 107, 107, 106, 110, 110};

        getCountingSort(arr);
    }
}
