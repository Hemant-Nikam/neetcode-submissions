class Solution {
    public String simplifyPath(String path) {

        String[] tokens = path.split("/");
        Deque<String> st = new ArrayDeque<>();
        for(String s : tokens){
            if(s.length() == 0 || s.equals("."))
                continue;
            else if(s.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            }
            else{
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append("/"+ st.removeLast());
        }
        return sb.toString().length() == 0 ? "/" : sb.toString();
    }
}