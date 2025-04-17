// Brute-force approach using extra space
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // int[][] ans = new int[n][n];

        // // Rotating by placing elements at the correct rotated position
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans[j][n - 1 - i] = matrix[i][j];
        //     }
        // }

        // // Copying the rotated matrix back to original matrix
        // for (int i = 0; i < n; i++) { // Fixed: should be i < n, not i <= n
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = ans[i][j];
        //     }
        // }





        //optimal solution 

        // first swap arr[i,j] to arr[j,i]
        // the rotatae its colum


        // for(int i=0;i<n;i++){

        //     for(int j=i+1;j<n;j++){
        //         int temp =matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }
        // //rotatate

        // for(int i=0;i<n;i++){
        //     int left=0;
        //     int right=n-1;
        //     while(left<right){
        //         int temp=matrix[i][left];
        //         matrix[i][left]=matrix[i][right];
        //         matrix[i][right]=temp;
        //         left++;
        //         right--;
        //     }
        // }



        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                // Swap
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }


    }
}

