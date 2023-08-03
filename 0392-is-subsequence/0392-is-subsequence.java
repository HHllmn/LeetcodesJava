class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int i = 0;
        char first = s.charAt(0);
        for (char item : t.toCharArray()){
            if (item == first){
                i++;
                if (i == s.length()) return true;
                first = s.charAt(i);
            } 
            
        }
        return false;
    }
}