class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] res = new int[temperatures.length];

        for(int i = temperatures.length - 1 ; i >= 0 ; i--)
        {
            int j = i + 1;
            while(j < temperatures.length && temperatures[j] <= temperatures[i])
            {
                if(res[j] == 0){
                    break;
                }
                j = j + res[j];
            }
            if(j < temperatures.length &&  temperatures[j] > temperatures[i])
                res[i] = j - i;

        }
        return res;
    }
}
