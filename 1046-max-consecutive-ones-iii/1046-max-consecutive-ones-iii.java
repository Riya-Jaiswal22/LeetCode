class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length, maxLen = 0, zeroCount = 0;
        while (j < n) {
            if (nums[j] == 0) zeroCount++;  
            while (zeroCount > k) {  
                if (nums[i] == 0) zeroCount--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }
}
