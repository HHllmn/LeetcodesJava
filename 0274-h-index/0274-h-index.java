class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int [] vals = new int [len + 1];

        for (int item : citations){
            if (item >= len){
                vals[len]++;
            }
            else{
                vals[item]++;
            }
        }
        
        int count = 0;
        for (int i = len; i >= 0; i--){
            count += vals[i];
            if (count >= i){
                return i;
            }
        }
        return 0;        
    }
}