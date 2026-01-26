class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int j=0;
        int k=target[target.length-1];
        for(int i=0;i<k;i++){
            if(i+1==target[j]){
                j++;
                list.add("Push");
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        // int l=n-k;
        // if(l!=0){
        //     for(int i=0;i<l;i++){
        //         list.add("Push");
        //         list.add("Pop");
                
        //     }
        // }
        return list;
        
    }
}
