class Solution {
    public int fib1(int n,int [] arr){
       
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[2]=arr[0]+arr[1];
            arr[0]=arr[1];
            arr[1]=arr[2];
        }
        return arr[2];
    }
    public int fib(int n) {
        int [] arr=new int [3];
        if(n<=1) return n;
        return fib1(n,arr);
    }
}
