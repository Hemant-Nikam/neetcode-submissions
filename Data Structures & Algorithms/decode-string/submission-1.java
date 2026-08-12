class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            
            sb.setLength(0);
            char ch = s.charAt(i);
            if(ch != ']'){
                st.push(Character.toString(ch));
            }
            else
            {
                while(!st.isEmpty() && !st.peek().equals("[")){
                    sb.append(st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    num.append(st.pop());
                }
                num.reverse();
                int cnt = Integer.parseInt(num.toString());
                String temp = sb.toString();
                for(int k = 1 ; k < cnt ; k++ )
                {
                    sb.append(temp);
                }
                st.push(sb.toString());
            }
        }
        sb.setLength(0);
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}