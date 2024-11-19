// Use the following methods of the Math class in Java: a. Math.min( ) b. Math.max( ) c. Math.sqrt( ) d. Math.pow( ) e. Math.avg( )
// f. Math.abs( )
public class ExploreMathsFunction {
    public static void main(String[] args) {
        double x= 10;
        double y= 20;
        int z=-5;

        System.out.println("Min: "+(int)Math.min(x, y));
        System.out.println("Max: "+(int)Math.max(x, y));
        System.out.println("Sqrt: "+Math.sqrt(y));
        System.out.println("Power: "+Math.pow(x, 3));
        System.out.println("Absolute Value of "+z+" is: "+Math.abs(z));
    }
}
