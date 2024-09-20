// See https://aka.ms/new-console-template for more information


int[] prices = {1,2,3,4,5};

int maxProfit = 0;

for (int i = 1; i < prices.Length; i++) {

    // If I buy and sell on the same day there wont be any profit
    // Once a day has been passed we cannot go back

    int priceOnIthDay = prices[i];

        int priceOnJthDay = prices[i-1];

        if (priceOnIthDay > priceOnJthDay) {
            maxProfit += (priceOnIthDay - priceOnJthDay);
        }
}
Console.WriteLine("Max Profit: " + maxProfit);
