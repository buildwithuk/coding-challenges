import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {

            if (count.containsKey(n)) {
                var replaceValue = count.get(n) + 1;

                if (replaceValue == 3)
                    count.remove(n);
                else {
                    count.replace(n, replaceValue);
                }
            } else {
                count.put(n, 1);
            }
        }

        return count.keySet().
    }
}
