import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * Solution of https://leetcode.com/problems/roman-to-integer/description/
 * 
 */

public class App {

    public static int romanToInt(String s) {
          // Define the mapping of Roman numerals to their integer values
          Map<Character, Integer> romanMap = new HashMap<>();
          romanMap.put('I', 1);
          romanMap.put('V', 5);
          romanMap.put('X', 10);
          romanMap.put('L', 50);
          romanMap.put('C', 100);
          romanMap.put('D', 500);
          romanMap.put('M', 1000);
  
          int total = 0;
          int prevValue = 0;
  
          // Traverse the Roman numeral string from right to left
          for (int i = s.length() - 1; i >= 0; i--) {
              char c = s.charAt(i);
              int currentValue = romanMap.get(c);
  
              // If the current value is less than the previous value, subtract it
              if (currentValue < prevValue) {
                  total -= currentValue;
              } else {
                  // Otherwise, add it to the total
                  total += currentValue;
              }
  
              // Update the previous value
              prevValue = currentValue;
          }
  
          return total;
    }



    public static void main(String[] args) throws Exception {
        
        System.out.println(romanToInt("IV"));
    }
}
