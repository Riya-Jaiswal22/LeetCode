class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; 
        while (k > 0) {
            long steps = getCount(curr, n);
            if (steps <= k) {
                curr++;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
    public long getCount(long curr, int n) {
        long next = curr + 1;
        long count = 0;
        while (curr <= n) {
            count += Math.min((long)n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return count;
    }
}
