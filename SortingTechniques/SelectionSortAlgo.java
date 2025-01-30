public class SelectionSortAlgo {
    public static void getSelectionSort(int arr[]) {
        // Loop over all elements
        for(int i=0;i<arr.length;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if( arr[j] < arr[minindex])
                {
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        getSelectionSort(arr);
    }
}
