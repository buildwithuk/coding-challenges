package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int findMaxProfit(int[] profits) {

        int maxProfit = 0;

        for (int i = 1; i < profits.length; i++) {

            int nextDayProfit = profits[i];
            int todayProfit = profits[i-1];

            if (nextDayProfit > todayProfit) {
                maxProfit += (nextDayProfit - todayProfit);
            }
        }

        return maxProfit;

    }



    public static void main(String[] args) {

        int[] maxProfit = {7,6,4,3,1};

        System.out.println( findMaxProfit(maxProfit));





    }
}