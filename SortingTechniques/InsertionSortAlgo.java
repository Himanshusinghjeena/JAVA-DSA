

public class InsertionSortAlgo {
    public static void getInsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++)
        {
            int curr= arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev] > curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
           
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
           }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        getInsertionSort(arr);
    }
}
