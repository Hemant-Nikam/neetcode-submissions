class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        
        while(i< asteroids.length){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
                i++;
            }
            else{
                if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                    i++;
                }

                else if(Math.abs(st.peek()) <= Math.abs(asteroids[i])){
                    int num = 0;
                    while(!st.isEmpty() && st.peek() > 0 && Math.abs(st.peek()) <= Math.abs(asteroids[i])){
                        if(Math.abs(st.peek()) == Math.abs(asteroids[i])){
                            num = st.pop();
                            break;
                        }
                        num = st.pop();
                    }
                    if((st.isEmpty() || st.peek() < 0) &&  Math.abs(num) != Math.abs(asteroids[i]) )
                        st.push(asteroids[i]);
                    i++;
                }
                    
                else if( Math.abs(st.peek()) > Math.abs(asteroids[i]))
                    i++;
                
            }
        }
        
        int[] ans = new int[st.size()];

        for (int j = st.size() - 1; j >= 0; j--) {
            ans[j] = st.pop();
        }
        return ans;
    }
}