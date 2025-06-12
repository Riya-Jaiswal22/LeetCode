class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int i,n=nums.length,res=0;
        for(i=1;i<n;i++){
            res = Math.max(res,Math.abs(nums[i-1]-nums[i]));
        }
        res = Math.max(res,Math.abs(nums[0]-nums[n-1]));
        return res;
    }
}