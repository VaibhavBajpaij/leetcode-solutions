class Solution {
    public int rev(int n){
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n=n/10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        // int len =nums.length;
        // int count=0;
        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //         if((nums[j]+rev(nums[i]))==(nums[i]+rev(nums[j]))){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        


        // Hash map solution  having n time complexity and n space complexity



        int len =nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<len;i++){
            int num=nums[i]-rev(nums[i]);

            if(map.containsKey(num)){
                int feq=map.get(num);
                count=count+feq;
                count=count%1000000007; //this is very importent becuse we use integer over flowin this question 
                map.put(num,feq+1);


            }else{
                map.put(num,1);
            }

    }
    return count;
        


    }
}
