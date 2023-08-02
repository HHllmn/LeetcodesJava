class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i<strs.length;i++){   
            String word = strs[i];
            int chars = Math.min(prefix.length(), word.length());
            int j = 0;
            while (j < prefix.length() && j < word.length() && (prefix.charAt(j) == word.charAt(j))) j++;
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}