class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> min = new ArrayList<>(triangle.get(triangle.size() - 1));

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int temp = Math.min(min.get(j), min.get(j + 1)) + triangle.get(i).get(j);
                min.set(j, temp);
            }
        }
        
        return min.get(0);
    }
}