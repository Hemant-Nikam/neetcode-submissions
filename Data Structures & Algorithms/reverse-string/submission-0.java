class Solution {
    public void reverseString(char[] s) {
        // int i = 0;
        // int j = s.length - 1
        for(int i = 0 ; i < s.length /2 ; i++){
            char x = s[i];
            s[i] = s[s.length - i -1  ];
            s[s.length -i -1] = x;
        }
    }
}