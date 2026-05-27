import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {

                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> result =
                groupAnagrams(words);

        System.out.println(result);
    }
}