
public class Operations {
    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return 1;
        }
        return 0;
    }

    public static int setIthBit(int n, int i) {
        int bitmask = (1 << i);
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i,int val) {
     if(val==0){
      return  clearIthBit(n, i);
     }
     else{
       return setIthBit(n, i);
     }
    }

    public static int clearLastIBits(int n, int i){
        int bitmask = ((-1)<<i);
        return n & bitmask;
    } 


    public static void main(String[] args) {
        // System.out.println(getIthBit(12,2));
        // System.out.println(setIthBit(12,1));
        // System.out.println(clearIthBit(12, 3));
    //    System.out.println( updateIthBit(10, 2,1));
       System.out.println(clearLastIBits(15,2));


    }
}
