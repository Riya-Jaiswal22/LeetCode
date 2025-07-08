class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int t = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int leftNum = nums[left];
                int rightNum = nums[right];
                if (t + leftNum + rightNum > 0) {
                    right--;
                } else if (leftNum + rightNum + t < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(t, leftNum, rightNum));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                }
            }
        }
        return result;
    }
}