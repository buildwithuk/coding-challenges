
package main

import "fmt"

func maxProfit(prices []int) int {
    maxProfit := 0

    // Iterate through the prices array
    for i := 1; i < len(prices); i++ {
        // If the price of the current day is greater than the previous day, calculate profit
        if prices[i] > prices[i-1] {
            maxProfit += prices[i] - prices[i-1]
        }
    }

    return maxProfit
}

func main() {
    // Example usage
    prices := []int{7, 1, 5, 3, 6, 4}
    fmt.Println("Max Profit:", maxProfit(prices))  // Output: 7
}
