class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int t = n / 3;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> added = new HashSet<>();
        for (int num : nums) {
            if (map.get(num) > t && !added.contains(num)) {
                res.add(num);
                added.add(num);
            }
        }
        return res;
    }
}
