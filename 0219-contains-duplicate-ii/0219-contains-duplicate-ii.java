class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j,n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<n;i++){
            if(!set.add(nums[i])){
                for(j=0;j<i;j++){
                    if(nums[i]==nums[j] && Math.abs(i-j)<=k) return true;
                }
            }
        }
        return false;
    }
}