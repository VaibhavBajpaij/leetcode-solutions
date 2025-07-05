class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> feq=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            feq.put(arr[i],feq.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for( int key: feq.keySet()){
            if(key==feq.get(key)) {
                ans=key;
            }
        }
        return ans;
        
    }
}
