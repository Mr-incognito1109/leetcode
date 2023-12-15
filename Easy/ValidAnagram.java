public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(new ValidAnagram().isAnagram(s, t));
        
    }

    public boolean isAnagram(String s, String t) {

        // Convert both the strings into lowercase 

        s = s.toLowerCase();
        t = t.toLowerCase();

        // get rid of the spaces in the strings 
        
        s = s.replace(" ", "");
        t = t.replace(" ", "");

        // initialize a bucket array 

        int[] bucket = new int[26];
        
        // iterate through the first string 
        
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }

        // iterate through the second string 

        for (int i = 0; i < t.length(); i++) {
            bucket[t.charAt(i) - 'a']--;
        }

        // iterate through the bucket array 

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != 0) {
                return false;
            }
        }
        return true;



    }
}
