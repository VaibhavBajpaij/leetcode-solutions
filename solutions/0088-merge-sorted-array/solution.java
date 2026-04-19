class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[n+m+1];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(i<m){
            for(int x=i;i<m;i++){
                arr[k]=nums1[i];
                k++;
            }
        }
        if(j<n){
            for(int x=j;j<n;j++){
                arr[k]=nums2[j];
                k++;
            }
        }
        for(int b=0;b<nums1.length;b++){
            nums1[b]=arr[b];
        }
       
        
    }
}
