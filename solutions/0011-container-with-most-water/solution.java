class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int i=0;
        int j=len-1;
        int area=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            area=Math.max(area,min*(j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
        
    }
}
