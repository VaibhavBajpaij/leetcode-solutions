class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sc=new Stack<>();

        for(char c: s.toCharArray()){
            if(!sc.empty() && sc.peek()==c){
                sc.pop();
            }else{
                sc.push(c);
            }
            
        }
        StringBuilder ans = new StringBuilder();;
        while(sc.size()>0){
            String val=String.valueOf(sc.pop());
            ans.append(val);  


        }
        return  ans.reverse().toString();
        
    }
}
