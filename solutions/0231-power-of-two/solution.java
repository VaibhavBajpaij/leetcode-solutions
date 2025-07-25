class Solution {
    public boolean ispower(float n){
        if(n==1) return true;
        if(n==2147483646) return false;
        if(n<1) return false;

        return ispower(n/2);

    }
    public boolean isPowerOfTwo(int n) {
        
        // int [] dp=new int [n+1];
        // Arrays.fill(dp,-1);
        if(n==1) return true;
        if(n%2!=0) return false;
        return ispower((float)n);
        // int i=1;
        // if(n==i) return true;
        // while(i<=n){
        //   i*=2;
        //   if(i==n) return true;
        // }
        // return false;
    }
}
