import java.util.HashMap;

class Solution {
    HashMap<Long, Integer> memo = new HashMap<>();
    public int integerReplacement(int n) {
        return countOps((long) n);
    }
    public int countOps(long n) {
        if (n == 1) return 0;
        if (memo.containsKey(n)) return memo.get(n);
        int res;
        if (n % 2 == 0) {
            res = 1 + countOps(n / 2);
        } else {
            res = 1 + Math.min(countOps(n - 1), countOps(n + 1));
        }
        memo.put(n, res);
        return res;
    }
}
