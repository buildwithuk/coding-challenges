package com.example.reverseinteger;

// https://leetcode.com/problems/reverse-integer/submissions/1466800910/

public class Main {

    public static int reverse(int x) { 

        try {

            // Convert x to String
            var stringFromX = String.valueOf(x);

            int endingIndex = 0;
            StringBuilder sb = new StringBuilder();
            if (x < 0) {
                endingIndex = 1;
                sb.append("-");
            }

            

            for (int a = stringFromX.length() - 1; a >= endingIndex; a--) {

                sb.append(stringFromX.charAt(a));
                
            }

            String finalReString = sb.toString();

            return Integer.parseInt(finalReString);
            



        } catch(Exception e) {
            return 0;
        }
        
    }


    public static void main(String[] args) {
        
        System.out.println( reverse(120));
    }
}