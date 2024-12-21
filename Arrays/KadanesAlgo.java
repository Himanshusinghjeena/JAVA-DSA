
class KadanesAlgo {
    public static int getMaxUsingkadanes(int num[]) {
        int maxsum = Integer.MIN_VALUE;

        int currsum = 0;
        for (int i = 0; i < num.length; i++) {
            currsum += num[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(getMaxUsingkadanes(num));
    }
}