public class StockProfit {
    public static int maxProfit(int[] prices) {
        // Edge case: if prices array is empty or has only one price, profit is 0
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; // Initialize the minimum price to the first day's price
        int maxProfit = 0;        // Initialize max profit to 0

        // Iterate through prices array starting from day 1
        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if current day's price is lower than the previously recorded minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate the profit if sold on the current day and update maxProfit if it's higher
                int potentialProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }

        // Return maxProfit, which is the highest profit possible, or 0 if no profit was possible
        return maxProfit;
    }

    public static void main(String[] args) {
        // Test example
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output should be 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + maxProfit(prices2)); // Output should be 0
    }
}
