class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int numLen = num.length();

        for (int i = 0; i < numLen/2; i++){
            if (num.charAt(i) != num.charAt(numLen - i - 1)) return false;
        }

        return true;
    }
}