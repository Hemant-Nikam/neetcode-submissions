class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minLen = nums.length + 1;
        while(r < nums.length){
            if(sum < target){
                sum += nums[r];
                r++;
            }
            else {
                minLen = Integer.min(r - l , minLen) ;
                sum -= nums[l];
                l++;
            }
        }
        while(sum >= target){
            minLen = Integer.min(r - l , minLen)  ;
            sum -= nums[l];
            l++;
        }
    
        return minLen == nums.length + 1 ? 0 :minLen;
    }
}