class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = 0; i <nums.length;i++){
            if (nums[i] == val){
                count--;
                nums[i] = 99;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}