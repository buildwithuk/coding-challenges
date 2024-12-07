package com.example.threesuminteger;

// https://leetcode.com/problems/3sum-closest/

public class Main {

    public static int threeSumClosest(int[] nums, int target) {

        // First find all the combinations
        // Then calculate their sum
        // Check if the sum is closer or not?

        int distanceFromTarget = Integer.MAX_VALUE;

        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {

                    int sumOfDigits = nums[a] + nums[b] + nums[c];
                    
                    if (Math.abs(target - sumOfDigits) < Math.abs(distanceFromTarget - target)) {
                        distanceFromTarget = sumOfDigits;
                    }
                }
            }
        }

        return distanceFromTarget;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
    }
}