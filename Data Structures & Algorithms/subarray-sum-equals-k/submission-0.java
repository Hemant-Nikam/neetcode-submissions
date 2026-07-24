class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] == k){
                cnt++;
            }
            int tempsum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                tempsum += nums[j];
                if(tempsum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}