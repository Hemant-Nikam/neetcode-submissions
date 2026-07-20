class Solution {
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int maxnum = nums[0];
        for(int num : nums){
            if(cnt == 0){
                maxnum = num;
            }
            if(num == maxnum){
                cnt++;
            }else{
                cnt--;
            }
        }
        return maxnum;
    }
}