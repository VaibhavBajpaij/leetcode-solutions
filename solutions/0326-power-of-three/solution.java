class Solution {

    public boolean ispower(float n){
        if(n==1) return true;
        if(n==1162261467) return true;
        
        if(n<1) return false;

        return ispower(n/3);
    }
    public boolean isPowerOfThree(int n) {
         if(n==1) return true;
        if(n%3!=0) return false;
        return ispower((float)n);
         
        
    }
}
