package Arrays;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            // Update minimum price so far
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit and update maxProfit
            else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max Profit (Example 1): " + maxProfit(prices1)); // Output: 5
        System.out.println("Max Profit (Example 2): " + maxProfit(prices2)); // Output: 0
    }
}

