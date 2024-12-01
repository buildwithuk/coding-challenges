import java.util.*;
import java.io.*;

class Main {

    public static String MinWindowSubstring(String[] strArr) {

        String N = strArr[0];
        String K = strArr[1];

        // Count the frequency of characters in K
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : K.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int required = charCount.size(); // Number of unique characters in K to match
        int left = 0, right = 0;
        int formed = 0;
        HashMap<Character, Integer> windowCounts = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int[] result = {-1, 0, 0}; // Length, start, end of the smallest window

        while (right < N.length()) {
            // Expand the window by including the character at `right`
            char c = N.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (charCount.containsKey(c) && windowCounts.get(c).intValue() == charCount.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window
            while (left <= right && formed == required) {
                c = N.charAt(left);

                // Update the smallest window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result[0] = minLen;
                    result[1] = left;
                    result[2] = right;
                }

                // Remove the character at `left` from the window
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (charCount.containsKey(c) && windowCounts.get(c).intValue() < charCount.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            // Expand the window
            right++;
        }

        return result[0] == -1 ? "" : N.substring(result[1], result[2] + 1);
    }

    public static void main (String[] args) {
        // keep this function call here
        MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"});
    }

}