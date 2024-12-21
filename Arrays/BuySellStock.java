public class BuySellStock {
    public static int stockProfit(int price[]) {

        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                // Today's Profit
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }

        System.out.println("Minimum Buying price: " + buyprice);

        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("maximum profit: " + stockProfit(price));
    }
}
