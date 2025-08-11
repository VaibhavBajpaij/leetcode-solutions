class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> list =new ArrayList<>();
         ArrayList<Integer> ans=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        if(n2<=n1){
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(list.contains(nums1[i])){
                ans.add(nums1[i]);
                list.remove(Integer.valueOf(nums1[i]));
            }
        }
        
        
        }else{
            for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
       
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                ans.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }
       
        }
        int[] a=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
            
        }
        return a;
        
    }
}
