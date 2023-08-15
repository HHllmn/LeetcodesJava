class Solution {
    public boolean canJump(int[] nums) {
        int range = 0;
        int i = 0;
        while (i < nums.length && i <= range){
            range = Math.max(i + nums[i], range);
            i++;
        }
        return range >= nums.length - 1;
    }
}