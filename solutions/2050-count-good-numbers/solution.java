class Solution {
    private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) { // Method signature is correct
        long even = n / 2 + n % 2; // Number of even positions
        long odd = n / 2; // Number of odd positions

        return (int) ((power(5, even) * power(4, odd)) % MOD); // Correct return statement
    }

    public static long power(long base, long exponent) {
        if (exponent == 0) return 1;

        long halfPower = power(base, exponent / 2) % MOD;
        long result = (halfPower * halfPower) % MOD;

        if (exponent % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}

