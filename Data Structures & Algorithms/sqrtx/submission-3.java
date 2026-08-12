class Solution {
    public int mySqrt(int x) {
        long i = 0;
        long j = ((long)x+1)/2  ;
        int ans = 0;
        while(i <= j )
        {
            long mid = i + ( j - i)/2;
            if(mid * mid == x)
                return (int) mid;
            else if(mid * mid < x){

                ans =(int) mid ;
                i = (int)mid + 1;
            }
            else 
                j = (int)mid - 1;
        }
        return ans;
    }
}