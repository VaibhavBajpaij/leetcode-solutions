class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int [][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);    
        }
        int x=longp(word1,word2,n-1,m-1,dp);
       int ans =n+m-2*x;
        return ans;
        
    }

   public int longp(String s,String r,int i,int j,int [][] dp){

        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==r.charAt(j)) return dp[i][j]=1+longp(s,r,i-1,j-1,dp);
        else{
            int x=longp(s,r,i-1,j,dp);
            int y=longp(s,r,i,j-1,dp);
            return dp[i][j]=Math.max(x,y);
        }

    }
}
