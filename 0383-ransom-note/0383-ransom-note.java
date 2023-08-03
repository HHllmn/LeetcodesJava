class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length()) return false;
        
        int[] letterCount = new int[26];

        for (char character : magazine.toCharArray()){
            letterCount[character-'a']++;
        }
        for (char character : ransomNote.toCharArray()){
            if (letterCount[character-'a'] == 0) return false;
            letterCount[character-'a']--;
        }
        return true;
    }
}