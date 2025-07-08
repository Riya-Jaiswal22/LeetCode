class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int candidate : set) {
            int count = 0;
            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }
            if (count > n / 2) {
                return candidate;
            }
        }
        return -1;
    }
}
