class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length ,i=0,j=0,maxlen=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<n){
                map.put(arr[j], map.getOrDefault(arr[j],0)+1);
                while(map.size()>2){
                    int frq=map.get(arr[i]);
                    if(frq==1) map.remove(arr[i]);
                    else map.put(arr[i],frq-1);

                    i++;
                }
               
                int len=j-i+1;
                maxlen=Math.max(maxlen,len);
                j++;

        }
        return maxlen;
    }
}
