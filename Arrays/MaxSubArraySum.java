
// Prefix-Method

public class MaxSubArraySum {
    public static int getMaxSubArraySum(int num[]) {
        int currsum=0;
        int prefix[]=new int[num.length];
        System.out.println(prefix);
        int max = -Integer.MIN_VALUE;

        // Prefix Array Creation
        prefix[0] = num[0];  // The sum up to the first element is just the first element
        for (int i = 1 ; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; 
        }

        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                currsum= i==0 ? prefix[j] : prefix[j]-prefix[i-1]; 
                if(currsum>max)
                {
                    max=currsum;
                }
            }
        }
       return max;
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        
       System.out.println( "max: "+getMaxSubArraySum(num));
    }
}
