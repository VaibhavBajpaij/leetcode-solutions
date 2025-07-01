class Solution {
    public int countPalindromicSubsequence(String s) {

        HashMap<Character,Integer>first=new HashMap<>();
        HashMap<Character,Integer>last=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!first.containsKey(c)) first.put(c,i);
            last.put(c,i);
        } 

       for(char c : first.keySet()){
            int firstIndex=first.get(c);
            int lastIndex=last.get(c);

            Set<Character> set=new HashSet<>();
            for(int j=firstIndex+1;j<=lastIndex-1;j++){
                set.add(s.charAt(j));

            }
            count=count+set.size();
        }

        return count;
        
    }
}
