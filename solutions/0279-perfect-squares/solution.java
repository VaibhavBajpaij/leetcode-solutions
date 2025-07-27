class Solution {
    //tabulation 2 method solution 
    public boolean isperfect(int num) {
        if (num < 0) return false;

        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num; // Check if square of sqrt equals original number
    }

   
 
 public int numSquares(int n) {
    int[] dp = new int[n+1];

    for(int i=1;i<=n;i++){

    if(isperfect(i)) dp[i] = 1;

    else{

    int min = Integer.MAX_VALUE;

    for(int j=1;j*j<=i/2;j++){

    int count = dp[j*j] + dp[i-j*j];
                       
    min =  Math.min(min,count);
     }
    dp[i] = min; 
    }
 }
    return dp[n];
        
}
}
