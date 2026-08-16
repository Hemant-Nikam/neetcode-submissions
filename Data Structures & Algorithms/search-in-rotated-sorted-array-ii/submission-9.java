class Solution {

    int findPivot(int[] nums , int i , int j)
    {
        while(i<j){
            while(i<j && nums[i] == nums[i+1])
                i++;
            while(i < j && nums[j]==nums[j-1])
                j--;
            int mid = i + (j - i) / 2 ;

            if(nums[mid] > nums[j])
            {
                i = mid+1;
            }
            else
            {
                j = mid;
            }
        }
        return j;
    }
    boolean binarySearch(int nums[],int i , int  j ,int target){
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            if(nums[mid]== target)
                return true;
            else if(nums[mid] > target)
            {
                j = mid - 1;
            }
            else
            {
                i = mid + 1;
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums , 0 , n-1);
        return   binarySearch(nums, 0 , pivot - 1 , target) || binarySearch(nums,pivot,n-1, target);
    }
}