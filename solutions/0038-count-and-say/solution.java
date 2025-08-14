class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        
       String ans="1";
        for(int i=2;i<=n;i++){
          ans = count(ans);
        }
        return ans;
        
    }
    public String count(String s){
        String ans="";
        int n=s.length();
        int i=1;
        int count=1;
        while(i<s.length()){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }else{
                ans+=count ;
                ans+=s.charAt(i-1);
                count=1;
            }
            i++;
        }
         ans+=count ;
            ans+=s.charAt(n-1);
        return ans; 

        

    }
}
