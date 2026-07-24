class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                map.put(key , map.get(key) + 1);
            }
            else{
                map.put(key,1);
            }
        }
        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            lst.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            lst.get(val).add(key);
        }
        int cnt = 0;
        List<Integer> ans = new ArrayList<>();
        int i = nums.length;
        while(cnt < k && i >= 0){
            for(int l : lst.get(i)){
                if (cnt == k)
                    break;
                ans.add(l);
                cnt++;
            }
            i--;
        }
        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}
