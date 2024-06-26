class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // 00 11 22 -> 01 12 23 -> 02 13
        
        for(int p=0; p<matrix.length; p++){
            for(int i=0; i<matrix[0].length; i++){
            
                int j = i;
                int k = p;
                int temp = matrix[k][j];
                j++;
                k++;
                while(k<matrix.length && j<matrix[k].length){
                    if(matrix[k][j] != temp){
                        return false;
                    }
                    k++;
                    j++;
                }
            }
        }
        return true;
    }
}
