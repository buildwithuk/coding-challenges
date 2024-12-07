import java.util.*;

public class Main {

    public List<List<String>> getAnagrams(String[] anagrams) {

        Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();


        for (int a = 0; a < anagrams.length; a++) {

            // Find the characters of the first element
            var characters = anagrams[a].toCharArray();

            // Sort the characters in ascending order
            Arrays.sort(characters);

            if (anagramsMap.containsKey(new String(characters))) {
                anagramsMap.get(new String(characters)).add(anagrams[a]);
            } else {
                var list = new ArrayList<String>();
                        list.add(anagrams[a]);
                anagramsMap.put(new String(characters), list);
            }

        }

        return new ArrayList<>(anagramsMap.values());



    }






    public static void main(String[] args) {

    }
}
