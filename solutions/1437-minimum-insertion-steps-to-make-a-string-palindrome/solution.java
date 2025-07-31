class Solution {
    public int minInsertions(String s) {
        String rev="";
        int i=s.length()-1;

        while(i>=0){
            rev=rev+s.charAt(i);
            i=i-1;
        }
        int [][] dp=new int [s.length()][s.length()];
        for(int j=0;j<s.length();j++){
            Arrays.fill(dp[j],-1);
        }
        int len=longp(s,rev,s.length()-1,s.length()-1,dp);
        return s.length()-len;
        
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
