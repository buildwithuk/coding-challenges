import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    /**
     * https://www.hackerrank.com/challenges/one-month-preparation-kit-equal-stacks/problem
     *
     * 
     * @param args
     * @throws Exception
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

        int h1Height = findSumOfStack(h1);
        int h2Height = findSumOfStack(h2);
        int h3Height = findSumOfStack(h3);

        if ( (h1 == h2) && (h2 == h3) ) {
            return h1Height;

        }

        // First check which stack has heigher height

        if (h1Height > h2Height && h2Height > h3Height) {
            h1.remove(0);
        } else if (h2Height > h1Height && h2Height > h3Height) {
            h2.remove(0);
        } else {
            h3.remove(0);
        }

        return equalStacks(h1, h2, h3);
    }

    public static boolean checkIfHeightsAreSame(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        return (findSumOfStack(h1) == findSumOfStack(h2)) && (findSumOfStack(h2) == findSumOfStack(h3));
    }

    public static int findSumOfStack(List<Integer> stack) {

        int sum = 0;
        if (stack != null && !stack.isEmpty()) {
            sum = stack.stream().mapToInt(Integer::valueOf).sum();
        }

        return sum;

    }

    public static void main(String[] args) {

        Integer[] h1 = new Integer[] { 3, 2, 1, 1, 1 };

        Integer[] h2 = new Integer[] { 4, 3, 2 };
        Integer[] h3 = new Integer[] { 1, 1, 4, 1 };

        List<Integer> c1 = new ArrayList<>(List.of(h1));
        List<Integer> c2 = new ArrayList<>(List.of(h2));
        List<Integer> c3 = new ArrayList<>(List.of(h3));

        System.out.println(equalStacks(c1, c2, c3));
    }
}
