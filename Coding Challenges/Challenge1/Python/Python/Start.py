def maxProfit(prices):
    max_profit = 0

    # Iterate through the prices array
    for i in range(1, len(prices)):
        # If the price of the current day is greater than the previous day, calculate profit
        if prices[i] > prices[i - 1]:
            max_profit += prices[i] - prices[i - 1]

    return max_profit



prices = [7, 1, 5, 3, 6, 4]
print(maxProfit(prices))  # Output: 7
