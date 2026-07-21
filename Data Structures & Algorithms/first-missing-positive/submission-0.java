class Solution {
    public int firstMissingPositive(int[] nums) {
        //cleaning the array:
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] < 1 || nums[i] > nums.length){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        //mark the numbers:
        for(int i = 0 ; i< nums.length;i++){
            int val = nums[i] > 0 ? nums[i] : nums[i] * -1;
            if(val != Integer.MAX_VALUE ){
                nums[val - 1] =nums[val -1] > 0 ? nums[val -1] * (-1) : nums[val -1];
            }
        }
        //checking the first positive number:
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] > 0 ){
                return i+1;
            }
        }
        //if not found anything:
        return nums.length+1;

    }
}