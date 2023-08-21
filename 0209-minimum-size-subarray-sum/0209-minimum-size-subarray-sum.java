class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        
        while (i < nums.length){
            sum += nums[i];
            
            while (sum >= target){
                sum -= nums[j];
                max = Math.min(i-j+1, max);
                j++;
            }
            i++;
        }
        if (max == Integer.MAX_VALUE) return 0;
        return max;
    }
}