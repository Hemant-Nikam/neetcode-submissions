class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        if(s.length() == 0)
            return true;
        while(i < j ){
            char x = Character.isLetter(s.charAt(i))?Character.toLowerCase(s.charAt(i)) : s.charAt(i) ;
            char y = Character.isLetter(s.charAt(j))?Character.toLowerCase(s.charAt(j)) : s.charAt(j) ;
            
            System.out.println("x : "+x+" y : "+y );
            if(Character.isLetterOrDigit(x) && Character.isLetterOrDigit(y)){
                if(x != y)
                    return false;
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(x))
                i++;
            else if(!Character.isLetterOrDigit(y) )
                j--;
        }
        return true;

    }
}