class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> check = new HashSet<>();
        
        int i = 0;
        int j = i+1;
        int k = j+1;
        int l = nums.length -1;
        Arrays.sort(nums);
        int len = nums.length;

        while(i < len -3 ){
            while(i > 0 && nums[i - 1] == nums[i]){
                    i++;
                    if(i == len -3 )
                        break;
            }
            j = i +1;
            while(j < len -2){
                while(j > i +1 && j < len -2 && nums[j - 1] == nums[j]){
                    j++;
                }
                k = j +1;
                l = nums.length -1;

                while(k<l){
                    long sum = (long)nums[i]+ nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        ans.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        while(k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                    }
                    else if(sum > target){
                        l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                }
                
                j++;
            }
            i++;
        }
        return ans;
    }
}