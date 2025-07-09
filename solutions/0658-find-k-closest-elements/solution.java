class Pair implements Comparable<Pair>{
    int x;
    int d;
    Pair(int x,int d){
        this.x=x;
        this.d=d;
    }
    public int compareTo(Pair p){
        if(p.d==this.d) return this.x-p.x;
        return this.d-p.d;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        

        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            int df=Math.abs(v-x);
           
            pq.add(new Pair(v,df));

            if(pq.size()>k) pq.remove();
           

          
            
        }
       ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(pq.size()>0){
            Pair p=pq.remove();
            
            ans.add(p.x);

        }
        Collections.sort(ans);
        return ans;
        
    }
}
