// Class to find the longest common prefix in an array of strings
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; // Edge case: empty array

        // Start with the first string as the common prefix
        String prefix = strs[0];

        // Compare with each string in the array
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            // Compare character by character
            while (j < prefix.length() && j < strs[i].length()
                    && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            // Shorten the prefix to matched characters
            prefix = prefix.substring(0, j);

            // If at any point prefix becomes "", return immediately
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}

