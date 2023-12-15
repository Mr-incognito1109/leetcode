import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_v2 {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(new ValidAnagram_v2().isAnagram(s, t));
        
    }

    public boolean isAnagram(String s, String t) {

    // Check if the two strings are the same length. If they are not, they cannot be anagrams.

    if (s.length() != t.length()) {
        return false;
    }

    // Create a hash map to store the characters in the first string.

    Map<Character, Integer> charMap = new HashMap<>();
    for (char c : s.toCharArray()) {
        charMap.put(c, charMap.getOrDefault(c, 0) + 1);
    }

    // Iterate through the second string and check if each character is in the hash map. If it is not, or if the count of the character in the hash map is 0, then the strings are not anagrams.

    for (char c : t.toCharArray()) {
        if (!charMap.containsKey(c) || charMap.get(c) == 0) {
            return false;
        }
        charMap.put(c, charMap.get(c) - 1);
    }

    // If all of the characters in the second string are in the hash map and the counts are all 0, then the strings are anagrams.

    return true;
}

    
}
