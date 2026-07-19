class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        char ans[] = new char[word1.length() + word2.length()];
        int idx = 0;
        while(i < word1.length() && j < word2.length()){
            ans[idx++] = word1.charAt(i++);
            ans[idx++] = word2.charAt(j++);
        }
        while(i < word1.length())
            ans[idx++] = word1.charAt(i++);

        while(j < word2.length())
            ans[idx++] = word2.charAt(j++);
        return new String(ans);
    }
}