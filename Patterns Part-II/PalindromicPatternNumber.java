public class PalindromicPatternNumber {
    public static void palindromicPattern(int n) {
        for( int i=1;i<=n;i++)
        {
            // Space
            for( int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }
            // print descending
            for(int j=i;j>1;j--)
            {
                System.out.print(j+" ");
            }
            // Print ascending
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromicPattern(9);
        
    }
}
