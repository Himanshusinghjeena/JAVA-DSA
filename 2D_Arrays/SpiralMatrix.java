public class SpiralMatrix {
    public static void getSpiralMatrix(int arr[][]) {
        int rowstart = 0;
        int colstart = 0;
        int rowend = arr.length - 1;
        int colend = arr[0].length - 1;
        
        while (rowstart <= rowend && colstart <= colend) {
            // top
            for (int j = colstart; j <= colend; j++) {
                System.out.print(arr[rowstart][j] + " ");
            }
            rowstart++;
            
            // right
            for (int i = rowstart; i <= rowend; i++) {
                System.out.print(arr[i][colend] + " ");
            }
            colend--; 
            
            // bottom
            if (rowstart <= rowend) { // Check to avoid printing the same row multiple times
                for (int j = colend; j >= colstart; j--) {
                    System.out.print(arr[rowend][j] + " ");
                }
                rowend--;
            }
            
            // left
            if (colstart <= colend) { // Check to avoid printing the same column multiple times
                for (int i = rowend; i >= rowstart; i--) {
                    System.out.print(arr[i][colstart] + " ");
                }
                colstart++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        getSpiralMatrix(arr);
    }
}
