class Solution {
    public int bestClosingTime(String customers) {

        int n=customers.length();
        int [] pre=new int [n+1];
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1];
            if(customers.charAt(i-1)=='N') pre[i]+=1;  
        }
        int [] suf=new int [n+1];
        suf[n]=0;
         for(int i=n-1;i>=0;i--){
           suf[i]=suf[i+1];
            if(customers.charAt(i)=='Y') suf[i]+=1;  
        }
        int [] a=new int [n+1];
         int ans=n+5;
        for(int i=0;i<n+1;i++){
            a[i]=pre[i]+suf[i];
             ans=Math.min(ans,a[i]);
        }
       
       

         for(int i=0;i<n+1;i++){
           if(ans==a[i]) return i;
        }
        return 0;
        


    }
}
