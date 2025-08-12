class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    HashMap<Character,Integer> maps=new HashMap<>();
     HashMap<Character,Integer> mapt=new HashMap<>();
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(maps.containsKey(c)){
            int val=maps.get(c);
            maps.put(c,val+1);
        }else{
            maps.put(c,1);
        }
     }
      for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        if(mapt.containsKey(c)){
            int val=mapt.get(c);
            mapt.put(c,val+1);
        }else{
            mapt.put(c,1);
        }
     }
     for(Map.Entry<Character,Integer> entry:mapt.entrySet()){
       if (!entry.getValue().equals(maps.get(entry.getKey()))) return false;

     }
     return true;

    }
}
