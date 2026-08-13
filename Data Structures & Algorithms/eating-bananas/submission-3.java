class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        long total = 0;
        for(int m : piles){
            total += m;
        }
        i = (int)((total - 1) / h) + 1;
        j =(int) (int)((total - piles.length) / (h - piles.length + 1)) + 1;
        int ans = 0;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            long count = 0;
            for(int k : piles){
                count += k % mid == 0 ? k/mid : k/mid + 1 ;
            }
            if(count > (long) h){
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