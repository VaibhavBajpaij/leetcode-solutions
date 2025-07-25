class Solution {

     public boolean ispower(float n){
        if(n==1) return true;
       // if(n==1162261467) return true;
        
        if(n<1) return false;

        return ispower(n/4);
    }
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4!=0) return  false;
        return ispower((float)n);

        
    }
}
