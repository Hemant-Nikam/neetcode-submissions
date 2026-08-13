class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        for(int m : piles){
            j = Math.max(j , m);
        }
        int ans = 0;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            int count = 0;
            for(int k : piles){
                count += k % mid == 0 ? k/mid : k/mid + 1 ;
            }
            if(count > h){
                i = mid + 1;
            }
            else{
                ans = mid;
                j = mid - 1;
            }

        }
        return ans;
    }
}