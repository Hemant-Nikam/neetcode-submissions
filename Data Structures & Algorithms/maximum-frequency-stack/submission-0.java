class FreqStack {
    Map<Integer,Integer> frq = new HashMap<>();
    Map<Integer,Stack<Integer>> st = new HashMap<>();
    int max = 0;
    public FreqStack() {
        
    }
    
    public void push(int val) {
        frq.put(val, frq.getOrDefault(val, 0) + 1);
        max = Math.max(frq.get(val),max);
        if(st.containsKey(frq.get(val)))
            st.get(frq.get(val)).push(val);
        else{
            st.put(frq.get(val),new Stack());
            st.get(frq.get(val)).push(val);
        }

    }
    
    public int pop() {
        int num = st.get(max).pop();
        frq.put(num , frq.get(num) -1 ); 
        if(st.get(max).isEmpty())
            max -= 1;
        return num;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */