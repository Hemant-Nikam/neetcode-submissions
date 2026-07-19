class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int wt = 0;
        
        int maxL = height[left];
        int maxR = height[right] ;

        while(left < right){
            if(maxL <= maxR){
                left++;
                maxL = Integer.max(maxL , height[left]);
                wt = wt + Integer.max(( maxL - height[left] ),0);
            }
            else{
                right--;
                maxR = Integer.max(maxR , height[right]);
                wt = wt + Integer.max( (maxR - height[right]) ,0);
            }
        }

        return wt;
    }
}