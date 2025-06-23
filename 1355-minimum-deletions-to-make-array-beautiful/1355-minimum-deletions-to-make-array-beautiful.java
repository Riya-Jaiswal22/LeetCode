class Solution {
    public int minDeletion(int[] nums) {
        int res = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if ((j - res) % 2 == 0 && nums[j] == nums[j + 1]) {
                res++;
            }
        }
        if ((nums.length - res) % 2 != 0) {
            res++;
        }
        return res;
    }
}
