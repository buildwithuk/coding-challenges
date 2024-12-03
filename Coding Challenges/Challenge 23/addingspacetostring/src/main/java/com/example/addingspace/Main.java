package com.example.addingspace;

// https://leetcode.com/problems/adding-spaces-to-a-string/?envType=daily-question&envId=2024-12-03

public class Main {

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int initialSpaceIndex = 0;
        int a = 0;
        for(a = 0; a < spaces.length; a++) {


            var indexOfSpace = spaces[a];

            var addedSubstring = s.substring(initialSpaceIndex, indexOfSpace);


            sb.append(addedSubstring);
            sb.append(" ");

            initialSpaceIndex = spaces[a];

        

        }

        if (a == spaces.length) {

            // Final substring
            sb.append(s.substring(spaces[spaces.length - 1], s.length()));


        }
        
        return sb.toString();
        

    }
    public static void main(String[] args) {

       
        System.out.println( addSpaces("EnjoyYourCoffee", new int[]{5, 9}));
    }
}