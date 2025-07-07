// User function Template for Java

class Solution {
    public static int unique_substring(String str) {
        // Your code here
        HashSet<String> uniqueSubstrings = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            
          for (int j = i + 1; j <= str.length(); j++) {
            
               uniqueSubstrings.add(str.substring(i, j));
            }
        }
        return uniqueSubstrings.size();
    }
}