class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for (int num : nums) total += num;
        int target = total - x;
        if (target < 0) return -1;  
        if (target == 0) return nums.length; 
        int n = nums.length;
        int left = 0, curr = 0, maxLen = -1;
        for (int right = 0; right < n; right++) {
            curr += nums[right];
            while (curr > target && left <= right) {
                curr -= nums[left];
                left++;
            }
            if (curr == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return (maxLen == -1) ? -1 : n - maxLen;
    }
}