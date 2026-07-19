class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ans = new int[nums.length];
        int idx = 0;
        int cnt = 0;

        int i = 0;
        while(i < nums.length){
            if(nums[i] != val){
                ans[idx++] = nums[i++];
                cnt ++ ;
            }
            else
                i++;
        }
        i = 0;
        while(i < cnt){
            nums[i] = ans[i];
            i++;
        }
        return cnt;
    }
}