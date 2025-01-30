
public class BubbleSortAlgo {
    public static void getBubbleSort(int num[]){
        for(int turn=0 ;turn<num.length;turn++)
        {
            for(int j=0;j<num.length-1-turn;j++)
            {
                if(num[j] > num[j+1]) 
                {
                    int temp= num[j];  
                    num[j]=num[j+1]; 
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        getBubbleSort(num);
        // printArr(num);
    }
}
