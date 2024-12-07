package com.example.mostwater;

// https://leetcode.com/problems/container-with-most-water/description/

public class Main {

    public int maxArea(int[] height) {

        if (height.length == 1) {
            return height[0];
        }

        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while ( leftPointer < rightPointer) {

            int width = rightPointer - leftPointer;

            int currentArea = Math.min(rightPointer, leftPointer) * width;

            maxArea = Math.max(currentArea, maxArea);

            // Move the pointer pointing to the shorter line
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }

        }



        return maxArea;


        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}