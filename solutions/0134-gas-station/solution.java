class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currgas=0;
        int total=0;
        int start=0;
        

        for (int i=0 ;i< gas.length ;i++){
            int gain = gas[i]- cost[i];
            total+=gain;
            currgas+=gain;

            if(currgas<0){
                start=i+1;
                currgas=0;
            }
            
        }

        if(total<0) return -1;
        return start;



        
    }
}
