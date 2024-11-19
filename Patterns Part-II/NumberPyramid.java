public class NumberPyramid {
    public static void numberPyramid(int row) {
        for(int i=1;i<=row;i++)
        {
            for(int space=1;space <=row-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       numberPyramid(7);
        
    }
}
