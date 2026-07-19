class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> check = new HashSet<>();
        
        int i = 0;
        int j = i+1;
        int k = j+1;
        Arrays.sort(nums);
        int len = nums.length;

        while(i < len -2){
            while(i > 0 && i < len -2 && nums[i - 1] == nums[i]){
                i++;
            }
            j = i +1;
            k = nums.length -1;

            while(j<k){
                int sum = nums[i]+ nums[j] + nums[k];
                if(sum == 0){
                    ans.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
                else if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
            }
            
            i++;
        }
        return ans;
    }
}