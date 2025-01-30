import java.util.Scanner;

class Basic2DArray {
    public static void getArrayInput(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean search(int arr[][], int key) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == key) {
                    System.out.print("Element found at index: " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        getArrayInput(arr);
        search(arr, 6);
    }
}