class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for (int i =1; i < intervals.length; i++){
            int valA = intervals[i][0];
            int valB = intervals[i][1];

            if (valA > end){
                res.add(new int[] {start,end});
                start = valA;
                end = valB;
            }
            else{
                end = Math.max(end, valB);
            }
        }

        res.add(new int[] {start,end});

        return res.toArray(new int[0][]);
    }
}