public class Pair implements Comparable<Pair>{
    int x;
    int f;
    Pair(int x,int f){
        this.x=x;
        this.f=f;
    }
    public int compareTo(Pair p){
        return this.f-p.f;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        
        int [] ans=new int [k];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int entry:map.keySet()){
            pq.add(new Pair(entry,map.get(entry)));
            if(pq.size()>k) pq.remove();
        }
        int i=0;
        while(pq.size()>0){
            Pair p=pq.remove();
            ans[i++]=p.x;
        }



        return ans;
    }
}
