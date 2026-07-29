class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String i : operations){
            if(Character.isDigit(i.charAt(i.length()-1))){
                st.add(Integer.parseInt(i));
            }
            else if(i.equals("C")){
                st.pop();
            }
            else if(i.equals("D")){
                int num = st.peek() * 2;
                st.push(num);
            }
            else if(i.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2);
                st.push(num1);
                st.push(num1 + num2);

            }
        }
        int sum = 0;
        for(int i : st){
            System.out.print(i + " ");
            sum += i;
        }
        return sum;
    }
}