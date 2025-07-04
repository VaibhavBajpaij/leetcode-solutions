class Solution {
    public char kthCharacter(long k, int[] operations) {

        ArrayList<Integer> arr=new ArrayList<>();
        long len=1;

        for(int i=0;i<operations.length;i++){
           arr.add(operations[i]);
           len=len*2;
           if(len>=k) break;
            
        }
        int inc=0;
        for(int i=arr.size()-1;i>=0;i--){
            len=len/2;
            if(k>len){
                k=k-len;

                if(arr.get(i)==1) inc++;
            }
        }
        return (char)('a'+(inc%26));
        
    }
}
