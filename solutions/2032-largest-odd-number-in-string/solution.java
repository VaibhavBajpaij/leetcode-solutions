// Class to solve the problem of finding the largest odd-numbered substring from left
class Solution {
    public String largestOddNumber(String num) {
        // Start from the last digit and move left
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            // Check if current digit is odd
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
                // Return substring from 0 to i+1 (inclusive of odd digit)
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return empty string
        return "";
    }
}

