class Solution {
    public int maxOperations(int[] nums, int k) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
       
        // int count=0;
        // outer:
        // for(int i=0;i<list.size()-1;i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(k==list.get(i)+list.get(j)){
        //             count++;
        //             list.remove(j);
        //             list.remove(i);
        //               i = -1; // restart outer loop since list changed
        //               continue outer;
                  
                    
                    
        //         }
                
  
                
        //     }
        // }
        // return count;




        HashMap<Integer, Integer> map = new HashMap<>();

        // Build frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : nums) {
            int ele = num;
            int rem = k - num;

            if (!map.containsKey(ele)) continue; // already used up

            if (map.containsKey(rem)) {
                if (ele == rem) {
                    int freq = map.get(ele);
                    int pairs = freq / 2;
                    count += pairs;
                    map.remove(ele); // used up all pairs
                } else {
                    int freqEle = map.get(ele);
                    int freqRem = map.get(rem);
                    int pairs = Math.min(freqEle, freqRem);
                    count += pairs;

                    // Decrease frequencies
                    if (freqEle > pairs) {
                        map.put(ele, freqEle - pairs);
                    } else {
                        map.remove(ele);
                    }

                    if (freqRem > pairs) {
                        map.put(rem, freqRem - pairs);
                    } else {
                        map.remove(rem);
                    }
                }
            }
        }

        return count;
    }
}

