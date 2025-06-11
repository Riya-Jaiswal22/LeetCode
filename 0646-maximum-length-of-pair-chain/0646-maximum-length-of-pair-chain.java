class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int currEnd = Integer.MIN_VALUE;
        int res = 0;
        for (int[] pair : pairs) {
            if (pair[0] > currEnd) {
                res++;
                currEnd = pair[1];
            }
        }   
        return res;
    }
}