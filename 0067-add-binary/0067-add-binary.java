class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carryBit = 0;

        StringBuilder outString = new StringBuilder();

        while (i>= 0 || j>= 0){
            int sum = carryBit;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            if (sum > 1) carryBit = 1;
            else carryBit = 0;

            outString.append(sum % 2);
        }
        
        if (carryBit == 1) outString.append(carryBit);
        return outString.reverse().toString();
        
    }
}