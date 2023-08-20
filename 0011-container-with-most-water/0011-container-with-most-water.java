class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = -1;
        int temp = -1;

        while (left < right){
            if (height[left] <= height[right]){
                temp = height[left] * (right - left);
                left++;
            }
            else{
                temp = height[right] * (right - left);
                right--;
            }
            max = temp > max ? temp : max;
        }
        return max;
    }
}