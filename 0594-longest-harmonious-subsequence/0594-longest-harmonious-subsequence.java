class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int start = 0, n = nums.length;
        for (int end = 0; end < n; end++) {
            while (nums[end] - nums[start] > 1) {
                start++;
            }
            if (nums[end] - nums[start] == 1) {
                res = Math.max(res, end - start + 1);
            }
        }
        return res;
    }
}
