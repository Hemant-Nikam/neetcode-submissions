class Solution {
    public int findMin(int[] nums) {
        int i = 1;
        int j = nums.length -1 ;
        int min = nums[0];
        while(i <= j )
        {
            int mid  = i + ( j - i) / 2;

            if(nums[mid] > min){
                i = mid + 1 ;
            }  
            else if(nums[mid] < min)   
            {
                min = nums[mid];
                j = mid - 1 ;
            }       
        }
        return min;
    }
}
