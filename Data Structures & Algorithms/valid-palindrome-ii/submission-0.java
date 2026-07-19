class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else if(isPal(s.substring(i,j)) || isPal(s.substring(i+1,j+1)))
                return true;
            else
                return false;
            
        }
        return true;
    }
    public boolean isPal(String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        int i = 0;
        int j = s.length() -1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}