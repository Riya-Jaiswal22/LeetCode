class Solution {
    public int nthUglyNumber(int n) {
        int[] prime = {2, 3, 5};
        int[] inc = {1, 1, 1};
        int[] nextUgly = {2, 3, 5};
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int count = 1; count < n; count++) {
            int next = Math.min(nextUgly[0], Math.min(nextUgly[1], nextUgly[2]));
            res.add(next);

            for (int i = 0; i < 3; i++) {
                if (nextUgly[i] == next) {
                    inc[i]++;
                    nextUgly[i] = prime[i] * res.get(inc[i] - 1);
                }
            }
        }

        return res.get(n - 1);
    }
}
