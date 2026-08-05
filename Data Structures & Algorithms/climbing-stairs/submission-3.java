class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        return solve(n , arr);
                
    }
    public int solve(int n , int arr[]){
        if(n == 1 || n == 0)
            return 1;
        if(arr[n] != 0 ){
            return arr[n];
        }
        return arr[n] =  solve(n-1 , arr) + solve(n - 2 ,arr);
    }
}
