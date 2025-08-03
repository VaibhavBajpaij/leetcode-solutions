class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {

        String lcs=LCS(str1,str2);
        
        int i=0;
        int j=0;
        int k=0;
        int n1=str1.length();
        int n2= str2.length();
        String s="";
        while(k<lcs.length()){

            while(str1.charAt(i)!=lcs.charAt(k)){
                s+=str1.charAt(i++);
            }
            while( str2.charAt(j)!=lcs.charAt(k)){
                s+=str2.charAt(j++);
            }
            s+=lcs.charAt(k);
            i++;
            j++;
            k++;

        }
        
        while(i<n1){
            s+=str1.charAt(i++);
        }
         while(j<n2){
            s+=str2.charAt(j++);
        }
       

        return s;
        
    }
    public String LCS(String s1,String s2){

        int n1=s1.length();
        int n2=s2.length();
        int [][] dp=new int[n1+1][n2+1];
        
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i=n1, j=n2;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        sb.reverse();
        return sb.toString();

    }
}
