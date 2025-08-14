class Solution {
    public String longestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int sl = s.length();
        int[][] dp = new int[sl + 1][sl + 1];

        int maxLen = 0;
        int endIndex = 0;

        // DP table fill (Longest Common Substring logic)
        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= sl; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    // Map rev index to original index
                    int revIndex = sl - j;
                    if (revIndex + dp[i][j] - 1 == i - 1) {
                        if (dp[i][j] > maxLen) {
                            maxLen = dp[i][j];
                            endIndex = i - 1;
                        }
                    }
                } else {
                    dp[i][j] = 0; // key change: reset if chars don't match
                }
            }
        }

        return s.substring(endIndex - maxLen + 1, endIndex + 1);
    }
}

