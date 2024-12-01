package com.example.challenge16;

// https://leetcode.com/problems/zigzag-conversion/description/


public class Main {

    public static String convert(String s, int numRows) {

        if (s.length() == 1) {
            return s;
        }

        StringBuilder[] zigZagList = new StringBuilder[numRows];

        int rowIndex = 0;

        boolean goingDown = true;

        for (int a = 0; a < numRows; a++) {
            zigZagList[a] = new StringBuilder();
        }

        for (char characterToInsert : s.toCharArray() ) {

            // Iterate over the characters

            zigZagList[rowIndex].append(characterToInsert);

            rowIndex += goingDown ? 1 : -1;
            if (rowIndex == numRows - 1 || rowIndex == 0) {
                goingDown = !goingDown;
                
            }

            
        }   


        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : zigZagList) {
            result.append(row);
        }

        return result.toString();

    }

    public static void main(String[] args) {

        String input = "PAYPALISHIRING";
        String result = convert(input, 3);

        System.out.println("s = " + input);
        System.out.println(result);

    }
}