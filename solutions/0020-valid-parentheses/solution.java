class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()<2) return false;
    //    char ch = s.charAt(0);
    //    char chl = s.charAt(s.length()-1);
       
    //     if(ch==')' || ch=='}' || ch==']'|| chl==')' || chl=='}' || chl==']') return false;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');


            }else if(c=='{'){
                st.push('}');

            }else if(c=='['){
                st.push(']');
            } else {
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}
