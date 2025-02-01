class Solution {
    public int[][] merge(int[][] intervals) {
        int i,n=intervals.length;
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] currentInterval = intervals[0];
        for(i=0;i<n;i++){
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[0] = Math.min(currentInterval[0],intervals[i][0]);
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                res.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        res.add(currentInterval);
        return res.toArray(new int[res.size()][]);
    }
}