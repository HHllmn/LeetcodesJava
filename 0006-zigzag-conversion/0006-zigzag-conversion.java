class Solution {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder[] str = new StringBuilder[numRows];
        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder();

        int i = 0;
        while (i < len){
            for (int j = 0; j < numRows && i < len; j++) str[j].append(chars[i++]);
            for (int j = numRows - 2; j >= 1 && i < len; j--) str[j].append(chars[i++]);
        }
        for (int j = 1; j < str.length; j++) str[0].append(str[j]);
        return str[0].toString();
    }
}