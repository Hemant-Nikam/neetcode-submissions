class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; 
        int i=0;       
        for(i=0; i <s.length();i++)
        {
            int index = i;
            int localmax=0;
            Set<Character> set = new HashSet<>();
            boolean flag =true;
            while(index < s.length())
            {
                char c = s.charAt(index);
                if(set.contains(c))
                {
                    if(max < localmax)
                    {
                        max = localmax;
                    }
                    break;
                }
                    
                set.add(c);
                localmax++;
                index++;
                
            }
            if(max < localmax)
                    {
                        max = localmax;
                    }
                    
            
        }
        return max;
    }
}