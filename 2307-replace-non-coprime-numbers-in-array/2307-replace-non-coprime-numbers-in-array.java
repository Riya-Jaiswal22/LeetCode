class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Long> stack = new ArrayList<>();
        for (int n : nums) {
            long cur = n;
            while (!stack.isEmpty() && gcd(stack.get(stack.size()-1).intValue(), (int)cur) > 1) {
                long prev = stack.remove(stack.size()-1);
                cur = lcm(prev, cur);
            }
            stack.add(cur);
        }
        List<Integer> res = new ArrayList<>();
        for (long val : stack) {
            res.add((int)val);
        }
        return res;
    }
}
