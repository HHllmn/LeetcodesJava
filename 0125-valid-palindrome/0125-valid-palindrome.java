class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int front = 0;
        int back= s.length() - 1;
        while(front <= back) {
        	char currentFront = s.charAt(front);
        	char currentBack = s.charAt(back);
        	if (!Character.isLetterOrDigit(currentFront )) {
        		front++;
        	} else if(!Character.isLetterOrDigit(currentBack)) {
        		back--;
        	} else {
        		if (Character.toLowerCase(currentFront) != Character.toLowerCase(currentBack)) {
        			return false;
        		}
        		front++;
        		back--;
        	}
        }
        return true;
    }
}