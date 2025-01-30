
public class DiagonalSumMatrix {
    public static int getDiagonalMatrix(int arr[][]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            // Primary Diagonal
            sum+=arr[i][i];

            // Secondary Diagonal
            sum+=arr[i][n-i-1];
        }
        if(n%2!=0){
            sum-= arr[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4 },
        //  { 5, 6, 7, 8 },
        //  { 9, 10, 11, 12 }, 
        // { 13, 14, 15, 16 }  };
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       System.out.print( getDiagonalMatrix(arr));
    }
}
