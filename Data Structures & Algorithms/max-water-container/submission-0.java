class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1 ;
        int ans = 0;
        while(i < j){
            int res = Math.min(height[i] , height[j]) * (j - i);
            if(res > ans){
                ans = res;
            }
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}