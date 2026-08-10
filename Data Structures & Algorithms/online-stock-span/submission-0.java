class StockSpanner {

    Stack<int[]> st = new Stack<>();
    boolean flag = true;
    public StockSpanner() {
    }
    
    public int next(int price) {
        int span = 1;
        if(flag && st.isEmpty()){
            flag = false;
            st.push(new int[] {price,1});
            return st.peek()[1];
        }
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[] {price,span});
        return st.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */