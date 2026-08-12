class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i=0 ; i < heights.length ; i++)
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i] )
            {   
                int ele = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea , heights[ele] * (nse - pse - 1));
            }
            st.push(i);            
        }
        while(!st.isEmpty())
        {
            int nse = heights.length;
            int ele = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea , heights[ele] * (nse - pse - 1));

        }
        return maxArea;
    }
}
