class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(x));
                    x++;
                }
                set.add(s.charAt(i));
                y++;
                l=Math.max(l,y-x);
            }else{
                //System.out.println(s.charAt(i));
                set.add(s.charAt(i));
                y++;
                l=Math.max(l,y-x);
            }


        }
        System.out.print(set);
        return l;

        
    }
}
