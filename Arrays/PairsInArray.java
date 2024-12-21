public class PairsInArray {
    public static int getPairs(int num[]){
        int totalpairs=0;
for (int i=0;i<num.length;i++)

{
    for(int j=i+1;j<num.length;j++)
    {
        System.out.print("(" +num[i]+","+num[j]+") ");
        totalpairs++;
    }
    System.out.println();
}
return totalpairs;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
       System.out.print( "Total Piars: "+getPairs(num));
    }
}
