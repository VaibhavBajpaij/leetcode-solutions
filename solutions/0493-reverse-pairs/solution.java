class Solution {
    public int reversePairs(int[] nums) {

        return reversemerge(nums,0,nums.length-1);
        
    }

    public int reversemerge(int[] arr,int l,int r){
        if(l>=r) return 0;
        int mid= l+(r-l)/2;
      int x=  reversemerge(arr,l,mid);
      int y=  reversemerge(arr,mid+1,r);

      int z=  merge(arr,l,mid,r);

      return x+y+z;
    }

    public int merge(int [] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] left=new int[n1];
        int [] right=new int [n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i+l];

        }
         for(int i=0;i<n2;i++){
            right[i]=arr[m+i+1];

        }
        int count = 0;

        // Count reverse pairs using left[i] > 2 * right[j]
        int j = 0;
        for (int i = 0; i < n1; i++) {
            while (j < n2 && (long) left[i] > 2 *(long) right[j]) {
                j++;
            }
            count += j;
        }

        int i=0;
         j=0;
        int k=l;
       
        while(i<n1 && j<n2){

            if(left[i]<=right[j]){
                arr[k++]=left[i];
                i++;
            }else{
                arr[k++]=right[j];
               
               
                j++;
            }
        }
        while(i<n1){
            arr[k++]=left[i];
            i++;
        }
        while(j<n2){
            arr[k++]=right[j];
            j++;
        }

        return count;

    }

    }

