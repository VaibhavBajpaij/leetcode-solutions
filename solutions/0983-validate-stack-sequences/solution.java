class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
       
       
        int j=0;
        Stack<Integer> st=new Stack<>(); 
        for(int val :pushed){
            st.push(val);

            while(!st.empty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }

        }
        return st.empty();
        
    }
}
