class Solution {
    public String reverseWords(String s) {
        String temp ="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);

            }else if(!temp.equals("")){
                st.push(temp);
                temp="";
            }
        }
        if( !temp.equals("")){
             st.push(temp);

        }
        String ans="";
        while(!st.empty()){

            ans+=st.pop();
            if(!st.empty())  ans+=" ";
           
            
        }

        return ans;
        
        
    }
}
