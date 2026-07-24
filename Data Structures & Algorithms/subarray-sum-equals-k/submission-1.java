class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int res = 0;
        for(int i = 0 ; i< nums.length;i++){
            sum += nums[i];
            int val = sum - k ;

            if(map.containsKey(val)){
                res += map.get(val);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }

        }
        return res;
    }
}