class Solution {
    public int lastRemaining(int n) {
        return helper(n,true);
        
        
    }
    public int helper(int n,boolean lr){
        if(n==1) return 1;

        if(lr || n%2==1){
            return 2*helper(n/2,!lr);
        }else{
            return 2*helper(n/2,!lr) -1;
        }
    }
}
