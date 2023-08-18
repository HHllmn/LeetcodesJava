class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int iA = 0;
        int iB = numbers.length - 1;

        while (numbers[iA] + numbers[iB] != target){
            if (numbers[iA] + numbers[iB] < target) iA++;
            else iB--;
        }
        return new int[] {iA + 1, iB + 1};
    }
}