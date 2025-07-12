class Solution {
    
    public int[] smallestRange(List<List<Integer>> nums) {
        int [] ans={0,Integer.MAX_VALUE};
        PriorityQueue<Triple> pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
       int k=nums.size();
       for(int i=0;i<k;i++){
        int ele=nums.get(i).get(0);
        pq.add(new Triple(ele,i,0));
        max = Math.max(max, ele);
       }

       while(true){
        Triple val=pq.remove();
        int ele=val.ele, row=val.row, col=val.col;

          if (max - ele < ans[1] - ans[0]) {
                ans[0] = ele;
                ans[1] = max;
            }

             if (col + 1 == nums.get(row).size()) {
                break;
            }
           int next=nums.get(row).get(col+1);
           pq.add(new Triple(next,row,col+1));
           max=Math.max(max,next);
            

        }

       
       return ans;
        
    }
}
class Triple implements Comparable<Triple>{
    int ele;
    int row;
    int col;
    Triple(int ele,int row,int col){
        this.ele=ele;
        this.row=row;
        this.col=col;
    }
  public  int compareTo(Triple t){
        return this.ele-t.ele;
    }
}
