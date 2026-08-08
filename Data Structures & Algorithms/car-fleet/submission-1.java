class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack <int[]>st = new Stack<>();
        int[][] pair = new int[position.length][2];
        for(int i = 0; i<position.length;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = position.length - 1; i >= 0 ;i--){
            int pos = i ; 
            if(st.isEmpty()){
                st.push(pair[pos]);
                System.out.println("Pushed : ( "+ pair[pos][0] + " , " + pair[pos][1] + " )");
                continue;
            }
            double time = (double)(target - pair[pos][0])/pair[pos][1];
            double peekTime = (double)(target - st.peek()[0])/st.peek()[1];
            if(time <= peekTime){
                continue;
            } 
            st.push(pair[pos]);
        }
        return st.size();

    }
}
