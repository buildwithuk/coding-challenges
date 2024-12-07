import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

     // https://leetcode.com/problems/longest-substring-without-repeating-characters/

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int initialLength = 0;
        HashSet<Character> characterSet;

        int lengthOfS = s.length();

        if (s.length() == 1 || s.isEmpty()) {
            return s.length();
        }




        for ( left = 0; left < lengthOfS; left++) {

            characterSet = new HashSet<>();

            characterSet.add(s.charAt(left));

            for (right = left + 1; right <  lengthOfS; right++) {

                var characterOnTheRight = s.charAt(right);

                // Character has been repeated
                if (characterSet.contains(characterOnTheRight) ) {

                    initialLength = characterSet.size() > initialLength ? characterSet.size() : initialLength;
                    break;

                } else {
                    characterSet.add(characterOnTheRight);

                    if ( right == lengthOfS -1 ) {
                        initialLength = characterSet.size() > initialLength ? characterSet.size() : initialLength;
                        break;
                    }

                }
            }

        }

        return initialLength;


    }


    public static void main(String[] args) {
        String input = "au";

        System.out.println(lengthOfLongestSubstring(input));


    }
}
