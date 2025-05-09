class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();


        HashMap<Integer,Integer> map=new HashMap<>();

        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int key:map.keySet()){
            if(n/3<map.get(key)) ans.add(key);
            
        }
        return ans;
    }
}
//         int n=nums.length;
//         int cot1=0;
//         int ele1=0;
//         int cot2=0;
//         int ele2=0;
//         for(int i=0;i<n;i++){

//             if(cot1==0 && nums[i]!=ele2){
//                 cot1=1;
//                 ele1=nums[i];
//             }
//             else if(cot2==0 && nums[i]!=ele1){
//                 cot2=1;
//                 ele2=nums[i];
//             }
//             else if(nums[i]==ele1){
//                 cot1++;
//             }else if(nums[i]==ele2){
//                 cot2++;
//             }
//             else{
//                 cot1--;
//                 cot2--;
//             }


//         }
//         int c=0;
//         int c2=0;

//         for(int i=0;i<n;i++){
//             if(nums[i]==ele1){
//                 c++;
//             }else if(nums[i]==ele2){
//                 c2++;
//             }
//         }
//         List<Integer> ans=new ArrayList<>();
//         if(c>n/3){
//             ans.add(ele1);
            
//         }
//         if(c2>n/3){
//             ans.add(ele2);
//         }
//         return ans;

        
        
//     }
// }
