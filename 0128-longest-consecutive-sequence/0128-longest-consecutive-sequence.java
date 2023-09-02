class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums) set.add(num);
        
        int max = 0;
        
        for (int item : set){
            if (!set.contains(item - 1)){
                int next = item + 1;
                while(set.contains(next)) next++;
                max = Math.max(max, next - item);
            }
        }
        return max;
    }
}