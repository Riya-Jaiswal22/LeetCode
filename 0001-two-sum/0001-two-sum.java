class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        int i=0,n=nums.length;
        while(i<n){
            if(map.get(target-nums[i])!=null){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }else{
                map.put(nums[i],i);
            }
            i++;
        }
        return res;
    }
}