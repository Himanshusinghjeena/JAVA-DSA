public class RecursionConcepts {

    public static void pI(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        pI(n - 1);
        System.out.print(n + " ");
    }

    public static void pD(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        pD(n - 1);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = n * fact(n - 1);
        return fact;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sum(n - 1);
        return sum;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[],int i , int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,i+1,key); 
    }
    
    public static int lastOccur(int arr[],int i , int key){
        if(i< 0){
            return -1;
        }
         if(arr[i] == key){
            return i;
        }
        int res = lastOccur(arr,i-1,key);
        // if(res != -1){
        //     return res;
        // }
        return res;
    }
    
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int res = x * power(x,n-1);
        return res;
    }
    

    public static void main(String[] args) {
        int n = 10;
        // pD(n);
        // System.out.println( fact(n));
        // System.out.print(sum(n));
        // System.out.println(fib(7));
        int arr[] = { 1, 2, 3, 6, 4, 5 };
        System.out.println(isSorted(arr, 0));
    }
}
