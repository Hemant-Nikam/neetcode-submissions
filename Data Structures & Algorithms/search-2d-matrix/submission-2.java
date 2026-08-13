class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx = -1;
        int i = 0;
        int j = matrix.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(matrix[mid][0] == target)
                return true;
            else if(matrix[mid][0] > target)
                j = mid - 1;
            else{
                idx = mid ;
                i = mid + 1;
            }
        }
        if(idx == -1)
            return false;
        i = 0;
        j = matrix[idx].length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(matrix[idx][mid] == target)
                return true;
            else if(matrix[idx][mid] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return false;
    }
}
