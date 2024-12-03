import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that adds up to the target
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Store the current number's index in the map
            map.put(nums[i], i);    

        }

        
        return null;
    }


    public static void main(String[] args) {

        twoSum(new int[] {3,2,4}, 6);
       
    }
}
