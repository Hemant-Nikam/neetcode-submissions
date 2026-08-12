class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int ele = 0;
        int pse = 0;
        int nse = 0;

        for(int i=0 ; i < heights.length ; i++)
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i] )
            {   
                ele = st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea , heights[ele] * (nse - pse - 1));
            }
            st.push(i);            
        }
        while(!st.isEmpty())
        {
            nse = heights.length;
            ele = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea , heights[ele] * (nse - pse - 1));

        }
        return maxArea;
    }
}
