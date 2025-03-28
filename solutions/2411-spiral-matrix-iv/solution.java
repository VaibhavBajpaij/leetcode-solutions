/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] matrix=new int[m][n];
        ListNode temp=head;
       
       int left=0;
       int right=n-1;
       int top=0;
       int down=m-1;
       
       for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

       while(top<=down && left<=right){

      
       for(int i=left;i<=right && temp != null;i++){
      //  if(temp!=null){
            
         matrix[top][i]=temp.val;
         temp=temp.next;

        // }else{
        //      matrix[top][i]=-1;

        // }
       }
       top++;

       for(int i=top;i<=down && temp != null;i++){
        // if(temp!=null){
            
              matrix[i][right]=temp.val;
              temp=temp.next;

        // }else{
        //      matrix[i][right]=-1;
        // }
       }
       right--;

       for(int i=right;i>=left && temp != null;i--){
        // if(temp!=null){
            
              matrix[down][i]=temp.val;
              temp=temp.next;

        // }else{
        //      matrix[down][i]=-1;
        // }
       }
       down--;
       for( int i=down;i>=top && temp != null ;i--){
       // if(temp!=null){
            
              matrix[i][left]=temp.val;
              temp=temp.next;

        // }else{
        //      matrix[i][left]=-1;
        // }
           

       }
       left++;
       }


       

        return matrix;
        
    }
}
