class Solution {
    public int romanToInt(String s) {
        int total = 0;
        char[] characters = s.toCharArray();
        for (int i = 0; i< characters.length ;i++){
            char current = characters[i];
            char nextChar = '.';
            if (i+1 != characters.length)nextChar = characters[i+1];
            if ((current == 'I') && ((nextChar == 'V')||(nextChar == 'X'))){
                total--;
            }
            else if (current == 'I'){
                total++;
            }
            else if ((current == 'X') && ((nextChar == 'L')||(nextChar == 'C'))){
                total = total - 10;
            }
            else if (current == 'X')
            {
                total = total + 10;
            }
            else if ((current == 'C') && ((nextChar == 'D')||(nextChar == 'M'))){
                total = total - 100;
            }
            else if (current == 'C'){
                total = total + 100;
            }
            switch (current){
                case 'V':
                    total = total + 5;
                    break;
                case 'L':
                    total = total + 50;
                    break;
                case 'D':
                    total = total + 500;
                    break;
                case 'M':
                    total = total + 1000;
                    break;
            }
        }
        return total;
    }
}