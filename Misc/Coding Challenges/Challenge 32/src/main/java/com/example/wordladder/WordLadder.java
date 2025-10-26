package com.example.wordladder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int steps = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(endWord)) {
                    return steps;
                }

                // Generate all possible transformations
                char[] charArray = currentWord.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char originalChar = charArray[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) {
                            continue;
                        }

                        charArray[j] = c;
                        String newWord = new String(charArray);

                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            visited.add(newWord);
                            queue.offer(newWord);
                        }
                    }

                    // Restore original character
                    charArray[j] = originalChar;
                }
            }
            steps++;
        }

        return 0;
    }

    public static void main(String[] args) {
        WordLadder solution = new WordLadder();

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println("Shortest transformation length: " + result); // Output: 5
    }
}
