class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int iA = 0;
        int iB = numbers.length - 1;

        while (iA < iB){
            int sum = numbers[iA] + numbers[iB];

            if (sum == target){
                return new int[] {iA + 1, iB + 1};
            }
            else if (sum < target){
                iA++;
            }
            else{
                iB--;
            }
        }
        return new int[] {-1};
    }
}