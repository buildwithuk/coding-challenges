// https://coderbyte.com/information/Bracket%20Matcher



public class BracketMatcher {

    public static String BracketMatcher(String str) {

        // First check if the str contains any brackets of not
        if (str.indexOf('(')  == -1 && str.indexOf(')') == -1) {
            return "1";
        }

        // First find the array of the characters
        var characters = str.toCharArray();

        int bracketsAccountedFor = 0;

        for (int a = 0; a < characters.length; a++) {

            var charAtA  = characters[a];

            if (charAtA == '(')
                bracketsAccountedFor++;
            else if (charAtA == ')')
                bracketsAccountedFor--;
        }


        if (bracketsAccountedFor == 0)
            return "1";
        else
            return "0";

    }

    public static void main (String[] args) {
        // keep this function call here


    }



}
