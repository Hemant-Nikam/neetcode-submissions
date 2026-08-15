class Solution {
    public int findMin(int[] nums) {
        int i = 1;
        int j = nums.length -1 ;
        int min = nums[0];
        int idx = 0;

        while(i <= j )
        {
            int mid  = i + ( j - i) / 2;

            if(nums[mid] > min){
                i = mid + 1 ;
            }  
            else if(nums[mid] < min)   
            {
                min = nums[mid];
                idx = mid;
                j = mid - 1 ;
            }       
        }
        return idx;
    }
    public int search(int[] nums, int target) {
        int tmid = findMin(nums);
        int i = 0 ;
        int j = 0;
        if(target == nums[tmid])
            return tmid;
        else if(target > nums[tmid])
        {
            if(target > nums[nums.length -1])
            {
                i = 0;
                j = tmid - 1 ;
            }
            else{
                i = tmid ; 
                j = nums.length - 1;
            }
        }
        else
        {
            if(target > nums[0])
            {
                i = tmid ; 
                j = nums.length - 1;
            }
            else{
                i = 0;
                j = tmid - 1 ;
            }

        }
        while(i <= j )
        {
            int mid  = i + ( j - i) / 2;

            if(nums[mid]== target)
                return mid;

            else if(nums[mid] > target)
                j = mid - 1;

            else
                i = i+ 1;       
        }
        return -1;
    }
}
