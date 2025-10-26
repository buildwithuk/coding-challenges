package com.example.foursum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        HashSet<Integer> hashSet = new HashSet<>();

        List<List<Integer>> toList = new ArrayList();

        for (int a = 0; a < nums.length; a++) {

            
            hashSet = new HashSet<>();
            hashSet.add(nums[a]);

            for (int b = a + 1; b < nums.length; b++) {

                if (hashSet.contains(nums[b])) {
                    continue;
                } else {
                    hashSet.add(nums[b]);

                }

                for (int c = b + 1; c < nums.length; c++) {

                    if (hashSet.contains(nums[c])) {
                        continue;
                    } else {
                        hashSet.add(nums[c]);

                    }

                    for (int d = c + 1; d < nums.length; d++) {

                        if (hashSet.contains(nums[d])) {
                            continue;
                        } else {
                            hashSet.add(nums[d]);
                            
                        }

                        if (hashSet.size() == 4) {

                            int sum = 0;

                            var iterator = hashSet.iterator();

                            while (iterator.hasNext()) {

                                var i = iterator.next();

                                System.out.print(i + " " );
                                sum += i;

                            }

                            System.out.println();

                            if (sum == target) {
                                toList.add(Stream.of((Integer[]) hashSet.toArray())
                                        .collect(Collectors.toList()));
                            }

                            break;
                        }

                    }

                }
            }

        }

        return toList;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}