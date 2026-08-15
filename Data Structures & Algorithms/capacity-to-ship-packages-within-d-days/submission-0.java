class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i = 0;
        int j = 0;
        for(int w : weights){
            j = j + w; 
            i = Math.max( i , w);
        }
        int ans = 0 ;
        while(i <= j)
        {
            int mid  = i + (j - i ) / 2 ;
            
            int daycnt = 0;
            int ind = 0 ;
            while( ind < weights.length)
            {
                int total = 0 ;
                while(ind < weights.length && total <=  mid  )
                {   
                    total = total + weights[ind] ;
                    ind ++ ;
                }
                if(total > mid){
                    ind = ind - 1 ;
                }
                daycnt ++ ;
            }
            if(daycnt <= days)
            {
                ans = mid ;
                j = mid - 1 ;
            }
            else if(daycnt > days)
            {
                i = mid + 1 ;
            }

        }
        return ans;

    }
}