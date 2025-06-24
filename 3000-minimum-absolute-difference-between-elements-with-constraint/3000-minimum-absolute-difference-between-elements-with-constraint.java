class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        if (x == 0) return 0; 
        TreeSet<Integer> set = new TreeSet<>();
        int res = Integer.MAX_VALUE;
        int n = nums.size();
        for (int j = x; j < n; j++) {
            set.add(nums.get(j - x));
            Integer floor = set.floor(nums.get(j));
            Integer ceil = set.ceiling(nums.get(j));
            if (floor != null) {
                res = Math.min(res, Math.abs(nums.get(j) - floor));
            }
            if (ceil != null) {
                res = Math.min(res, Math.abs(nums.get(j) - ceil));
            }
        }
        return res;
    }
}
