class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
       int max=0;
        for(int i=0;i<n;i++){
            int c=0;
            HashSet<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1 ;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                   
                    break;
                }
                set.add(s.charAt(j));
                if(set.size()<j-i+1){
                   
                    break;
                }
                

            }
             c=set.size();

            max=Math.max(c,max);
        }
        
       return max;
        
    }
}
