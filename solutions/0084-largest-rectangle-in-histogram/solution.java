class Solution {
    public int largestRectangleArea(int[] heights) {
        
        // This is brute force approch
        // int maxsum=0;
        // for ( int i=0;i<heights.length;i++){
        //         int min=Integer.MAX_VALUE;
        //     for(int j=i;j<heights.length;j++){
        //         min=Math.min(min,heights[j]);
        //         int width = j - i + 1;
        //         int area=width*min;
        //         maxsum=Math.max(area,maxsum);
        //     }
        // }
        // return maxsum;


        // optimal solution using stack
        int n=heights.length;
        int [] left=new int [n];
        int [] right =new int [n];
        Stack<Integer> st=new Stack<>();

        // for right smaller
        for(int i=n-1;i>=0;i-- ){
            while(!st.empty() && heights[st.peek()]>=heights[i]) {
                st.pop();
            }
            if(st.empty()){
                right[i]=n;
            }else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        // removing value from the stack
        while(!st.empty()){
            st.pop();
        }

        // for left smaller

        for(int i=0;i<n;i++ ){
            while(!st.empty() && heights[st.peek()]>=heights[i]) {
                st.pop();
            }
            if(st.empty()){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }
             st.push(i);
        }
        int maxarea=0;
        int min=Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
    int width = right[i] - left[i] - 1;
    int area = heights[i] * width; 
    maxarea = Math.max(area, maxarea);
}

        return maxarea;



        
        
    }
}
