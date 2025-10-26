package com.example.mergeintervals;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the intervals
        for (int[] interval : intervals) {
            // If the list is empty or there is no overlap with the last interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval); // Add the current interval
            } else {
                // Merge the current interval with the last interval in the list
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 4: Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        // Example input
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        // Merge intervals
        int[][] result = merge(intervals);

        // Print the result
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
