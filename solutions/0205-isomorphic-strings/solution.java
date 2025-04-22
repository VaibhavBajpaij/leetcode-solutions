class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map1=new HashMap<>();


        for(int i=0;i<s.length();i++){
           char s1=s.charAt(i);
           char t1=t.charAt(i);

            if(map.containsKey(s1)){
                int key=map.get(s1);
                if(key!=t1) return false;

            }else{
                map.put(s1,t1);
            }
             if(map1.containsKey(t1)){
                int key=map1.get(t1);
                if(key!=s1) return false;

            }else{
                map1.put(t1,s1);
            }

        }
        return true;
        
    }
}
