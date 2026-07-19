class Solution {
    public String longestCommonPrefix(String[] strs) {
        String one = strs[0];
        int i = 0;
        int j = 0;
        
        for(int index = 1 ; index < strs.length ; index++){
            i= 0;
            j = 0;
            String two = strs[index];
            while( i < one.length() && j < two.length() && one.charAt(i) == two.charAt(j)){
                i++;
                j++;
            }
            if(i == 0){
                return "";
            }
            one = one.substring(0,i);
        }
        return one;
    }
}